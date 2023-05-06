package com.ashokit.insurance.service;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.ashokit.insurance.entity.CitizenPlan;
import com.ashokit.insurance.repo.CitizenPlanRepository;
import com.ashokit.insurance.request.SearchRequest;
import com.ashokit.insurance.utils.EmailUtils;
import com.ashokit.insurance.utils.ExcelGenerator;
import com.ashokit.insurance.utils.PdfGenerator;

@Service
public class ReportServiceimpl implements ReportService {

	@Autowired
	private CitizenPlanRepository planRepo;
	
	@Autowired
	private ExcelGenerator excelGenerator;
	
	@Autowired
	private PdfGenerator pdfGenerator;
	
	@Autowired
	private EmailUtils emailUtils;
	
	@Override
	public List<String> getPlanNames() {
		return planRepo.getPlanNames();
	}

	@Override
	public List<String> getPlanStatuses() {
		return planRepo.getPlanStatus();
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		
		CitizenPlan entity = new CitizenPlan();

		if(null != request.getPlanName() && !"".equals(request.getPlanName())) {
			entity.setPlanName(request.getPlanName());
		}
			
		if(null != request.getPlanStatus() && !"".equals(request.getPlanStatus())) {
				entity.setPlanStatus(request.getPlanStatus());	
		}
		
		if(null != request.getGender() && !"".equals(request.getGender())) {
					entity.setGender(request.getGender());
		}
		
		if(null != request.getStartDate() && !"".equals(request.getStartDate())) {
			String startDate = request.getStartDate();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			//convert string to local date
			LocalDate localDate = LocalDate.parse(startDate, formatter);
			entity.setPlanStartDate(localDate);
		}
		
		if(null != request.getEndDate() && !"".equals(request.getEndDate())) {
			String endDate = request.getEndDate();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			//convert string to local date
			LocalDate localDate = LocalDate.parse(endDate, formatter);
			entity.setPlanEndDate(localDate);
		}
		
		return planRepo.findAll(Example.of(entity));
	}

	@Override
	public boolean exportExcel(HttpServletResponse response) throws Exception {
	
	File file = new File("Plans.xls");
		
	List<CitizenPlan> plans = planRepo.findAll();
	excelGenerator.generate(response, plans, file) ;
	
	String subject = "Test Mail subject";
	String body = "<h1>Test mail body</h1>";
	String to = "sunnyalexa19@gmail.com";
	
	emailUtils.sendEmail(subject, body, to, file);
	
	file.delete();
	
	return true;
	}
	
	@Override
	public boolean exportPDF(HttpServletResponse response) throws Exception {
		
		File file = new File("Plans.pdf");
		
		List<CitizenPlan> plans = planRepo.findAll();
		pdfGenerator.generate(response, plans, file);
		
		String subject = "Test Mail subject";
		String body = "<h1>Test mail body</h1>";
		String to = "sunnyalexa19@gmail.com";
		
		emailUtils.sendEmail(subject, body, to, file);
		
		file.delete();
		
		return true;
	}
	}
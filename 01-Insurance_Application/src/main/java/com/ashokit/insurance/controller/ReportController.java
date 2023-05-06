package com.ashokit.insurance.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.insurance.entity.CitizenPlan;
import com.ashokit.insurance.request.SearchRequest;
import com.ashokit.insurance.service.ReportService;

@Controller
public class ReportController {
	
	@Autowired
	private ReportService service;
	
	@GetMapping("/pdf")
	public void pdfExport(HttpServletResponse response) throws Exception {
	
		response.setContentType("application/pdf");
	
		response.addHeader("Content-Disposition","attachment; filename=plans.pdf");
	
		service.exportPDF(response);
	}
	
	@GetMapping("/excel")
	public void excelExport(HttpServletResponse response) throws Exception {
		
		response.setContentType("application/octet-stream");
		
		response.addHeader("Content-Disposition", "attachment;filename=plans.xls");
		
		service.exportExcel(response);
	}
	
	@PostMapping("/search")
	public String handleSearch(@ModelAttribute("search")SearchRequest request, Model model) {
		
		List<CitizenPlan> plans = service.search(request);
		
		model.addAttribute("plans", plans);
		
		init(model);
		
		return "index";
	}
	
	/**
	* This method is used to load index page
	* @Param model
	+ @return String
	*/
	
	@GetMapping("/")
	public String indexPage(Model model) {
		
		model.addAttribute("search", new SearchRequest());//used to load empty index page
		
		init(model);
		
		return "index";
	}

	private void init(Model model) {
		
		model.addAttribute("names", service.getPlanNames());
		
		model.addAttribute("status", service.getPlanStatuses());
	}
}

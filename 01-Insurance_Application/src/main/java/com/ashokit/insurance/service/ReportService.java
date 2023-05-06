package com.ashokit.insurance.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.ashokit.insurance.entity.CitizenPlan;
import com.ashokit.insurance.request.SearchRequest;

public interface ReportService {

	public List<String> getPlanNames();
	
	public List<String> getPlanStatuses();

	public List<CitizenPlan> search(SearchRequest request);
	
	public boolean exportExcel (HttpServletResponse response) throws Exception;
	
	public boolean exportPDF (HttpServletResponse response) throws Exception;

	
}

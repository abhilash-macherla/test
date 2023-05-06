package com.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.insurance.request.SearchRequest;
import com.ashokit.insurance.service.ReportService;

@Controller
public class ReportController {
	
	@Autowired
	private ReportService service;
	
	@PostMapping("/search")
	public String handleSearch(SearchRequest request, Model model) {
		
		System.out.println(request);
		
		init(model);
		
		return "index";
	}
	
	@GetMapping("/")
	public String indexPage(Model model) {
		
		model.addAttribute("search", new SearchRequest());
		
		init(model);
		
		return "index";
	}

	private void init(Model model) {
		model.addAttribute("names", service.getPlanNames());
		
		model.addAttribute("status", service.getPlanStatuses());
	}
}

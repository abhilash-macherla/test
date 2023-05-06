package com.ashokit.studentenquiry.services;

import java.util.List;

import com.ashokit.studentenquiry.binding.DashboardResponse;
import com.ashokit.studentenquiry.binding.EnquiryForm;
import com.ashokit.studentenquiry.binding.EnquirySearchCriteria;
import com.ashokit.studentenquiry.entities.StudentEnqEntity;

public interface EnquiryService {
	
	List<String> getCourseNames();
	
	List<String> getEnquiryStatus();
	
	DashboardResponse getDashboardData(Integer userId);
	
	Boolean saveEnquiry(EnquiryForm form,Integer userId);
	
	List<StudentEnqEntity> getEnquiries(Integer userId,EnquirySearchCriteria search);
	
	StudentEnqEntity getStudentEnq(Integer eId);

}

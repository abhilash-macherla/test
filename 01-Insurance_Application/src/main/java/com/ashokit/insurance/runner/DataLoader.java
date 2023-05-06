package com.ashokit.insurance.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ashokit.insurance.entity.CitizenPlan;
import com.ashokit.insurance.repo.CitizenPlanRepository;

@Component
public class DataLoader implements ApplicationRunner{
	
	@Autowired
	private CitizenPlanRepository repo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {


		repo.deleteAll();
		
		//Cash Plan Approved
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("John");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now().minusMonths(5));
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmount(5000.0);
		
		//Cash Plan Denied
		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("Smith");
		c2.setGender("Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denied");
		c2.setDenialReason("Rental Income");
		
		//Cash Plan Terminated
		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("Cathy");
		c3.setGender("FeMale");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenefitAmount(4000.00);
		c3.setTerminatedDate(LocalDate.now());
		c3.setTerminationReason("Property Income");
		
		//Food Plan Approved
		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizenName("David");
		c4.setGender("Male");
		c4.setPlanName("Food");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now()) ;
		c4.setPlanEndDate(LocalDate.now().plusMonths(6)) ;
		c4.setBenefitAmount(6000.00);
		
		//Cash Plan Denied
		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("Rajesh");
		c5.setGender("Male");
		c5.setPlanName("Cash");
		c5.setPlanStatus("Denied");
		c5.setDenialReason("Property Income");
		
		//Cash Plan Terminated
		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizenName("Kareen");
		c6.setGender("Fe-Male");
		c6.setPlanName("Cash");
		c6.setPlanStatus("Terminated");
		c6.setPlanStartDate(LocalDate.now().minusMonths(4));
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setBenefitAmount(5200.00);
		c6.setTerminatedDate(LocalDate.now());
		c6.setTerminationReason("Property Income");
		
		//Medical Plan Approved
		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("Charles");
		c7.setGender("Fe-Male");
		c7.setPlanName("Food");
		c7.setPlanStatus("Approved");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate (LocalDate.now().plusMonths(6));
		c7.setBenefitAmount(6400.00);
		
		//Medical Plan Denied
		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizenName("Robert");
		c8.setGender("Male");
		c8.setPlanName("Food");
		c8.setPlanStatus("Approved");
		c8.setPlanStartDate(LocalDate.now());
		c8.setPlanEndDate(LocalDate.now().plusMonths(6));
		c8.setBenefitAmount(3500.00);
		
		//Medical Plan Terminated
		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizenName("Neelima"); 
		c9.setGender("Fe-Male"); 
		c9.setPlanName("Food"); 
		c9.setPlanStatus("Declined");
		c9.setDenialReason("Income");
		
		// Employment Plan Approved
		CitizenPlan c10 = new CitizenPlan();
		c10.setCitizenName ("Steve");
		c10.setGender("Male");
		c10.setPlanName("Food"); 
		c10.setPlanStatus("Declined");
		c10.setDenialReason("Income");
	
		//Food Plan Terminated
		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizenName("Moris");
		c11.setGender("Male");
		c11.setPlanName("Food");
		c11.setPlanStatus("Terminated");
		c11.setPlanStartDate(LocalDate.now().minusMonths(4));
		c11.setPlanEndDate(LocalDate.now().plusMonths(6));
		c11.setBenefitAmount(4000.00);
		c11.setTerminatedDate(LocalDate.now());
		c11.setTerminationReason("Property Income");
		
		//Food Plan Terminated
		CitizenPlan c12 = new CitizenPlan ();
		c12.setCitizenName("Ramya");
		c12.setGender("Fe-Male");
		c12.setPlanName("Food");
		c12.setPlanStatus("Terminated");
		c12.setPlanStartDate(LocalDate.now().minusMonths(4));
		c12.setPlanEndDate(LocalDate.now().plusMonths(6));
		c12.setBenefitAmount(7000.00);
		c12.setTerminatedDate(LocalDate.now());
		c12.setTerminationReason("Govt Job");
		
		//Medical Plan Approved
		CitizenPlan c13 = new CitizenPlan();
		c13.setCitizenName("Bharath");
		c13.setGender("Male");
		c13.setPlanName("Medical");
		c13.setPlanStatus("Approved");
		c13.setPlanStartDate(LocalDate.now());
		c13.setPlanEndDate(LocalDate.now().plusMonths(6));
		c13.setBenefitAmount(2500.00);
		
		//Medical Plan Approved
		CitizenPlan c14 = new CitizenPlan();
		c14.setCitizenName("Pavani");
		c14.setGender("Fe-Male");
		c14.setPlanName("Medical");
		c14.setPlanStatus("Approved");
		c14.setPlanStartDate(LocalDate.now());
		c14.setPlanEndDate(LocalDate.now().plusMonths(6));
		c14.setBenefitAmount(1500.00);
		
		//Medical Plan Declined
		CitizenPlan c15 = new CitizenPlan();
		c15.setCitizenName("Rakesh");
		c15.setGender("Male");
		c15.setPlanName("Medical");
		c15.setPlanStatus("Declined");
		c15.setDenialReason("Income");
		
		//Medical Plan Declined
		CitizenPlan c16 = new CitizenPlan();
		c16.setCitizenName("Sravani");
		c16.setGender("Fe-Male");
		c16.setPlanName("Medical");
		c16.setPlanStatus("Declined");
		c16.setDenialReason("Income");
		
		//Medical Plan Terminated
		CitizenPlan c17 = new CitizenPlan();
		c17.setCitizenName("Ramana");
		c17.setGender("Male");
		c17.setPlanName("Medical");
		c17.setPlanStatus("Terminated");
		c17.setPlanStartDate(LocalDate.now().minusMonths(2));
		c17.setPlanEndDate(LocalDate.now().plusMonths(4));
		c17.setTerminatedDate(LocalDate.now());
		c17.setTerminationReason("Emoloyer");
		
		//Medical Plan Terminated
		CitizenPlan c18 = new CitizenPlan();
		c18.setCitizenName("Barsha");
		c18.setGender("Fe-Male");
		c18.setPlanName("Medical");
		c18.setPlanStatus("Terminated");
		c18.setPlanStartDate(LocalDate.now().minusMonths(4));
		c18.setPlanEndDate(LocalDate.now().plusMonths(2));
		c18.setTerminatedDate(LocalDate.now());
		c18.setTerminationReason("Emoloyer");
		
		//Employment Plan Approved
		CitizenPlan c19 = new CitizenPlan();
		c19.setCitizenName("Rahul");
		c19.setGender("Male");
		c19.setPlanName("Employment");
		c19.setPlanStatus("Approved");
		c19.setPlanStartDate(LocalDate.now());
		c19.setPlanEndDate(LocalDate.now().plusMonths(6));
		c19.setBenefitAmount(3600.00);
		
		//Employment Plan Approved
		CitizenPlan c20 = new CitizenPlan();
		c20.setCitizenName("Sindhu");
		c20.setGender("Fe-Male");
		c20.setPlanName("Employment");
		c20.setPlanStatus("Approved");
		c20.setPlanStartDate(LocalDate.now());
		c20.setPlanEndDate(LocalDate.now().plusMonths(6));
		c20.setBenefitAmount(9600.00);
		
		//Employment Plan Declined
		CitizenPlan c21 = new CitizenPlan();
		c21.setCitizenName("Shiva");
		c21.setGender("Male");
		c21.setPlanName("Employment");
		c21.setPlanStatus("Declined");
		c21.setDenialReason("Income");
		
		//Employment Plan Approved
		CitizenPlan c22 = new CitizenPlan();
		c22.setCitizenName("Kavitha");
		c22.setGender("Fe-Male");
		c22.setPlanName("Employment");
		c22.setPlanStatus("Declined");
		c22.setDenialReason("Income");
		
		//Employment Plan Terminated
		CitizenPlan c23 = new CitizenPlan();
		c23.setCitizenName("Devaraju");
		c23.setGender("Male");
		c23.setPlanName("Employment");
		c23.setPlanStatus("Terminated");
		c23.setPlanStartDate(LocalDate.now().minusMonths(1));
		c23.setPlanEndDate(LocalDate.now().plusMonths(5));
		c23.setTerminatedDate(LocalDate.now());
		c23.setTerminationReason("Emoloyer");
		
		//Employment Plan Terminated
		CitizenPlan c24 = new CitizenPlan();
		c24.setCitizenName("Swapna");
		c24.setGender("Fe-Male");
		c24.setPlanName("Employment");
		c24.setPlanStatus("Terminated");
		c24.setPlanStartDate(LocalDate.now().minusMonths(3));
		c24.setPlanEndDate(LocalDate.now().plusMonths(3));
		c24.setTerminatedDate(LocalDate.now());
		c24.setTerminationReason("Emoloyer");
	
		List<CitizenPlan> list = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24 );
		
		repo.saveAll(list);
	}
}
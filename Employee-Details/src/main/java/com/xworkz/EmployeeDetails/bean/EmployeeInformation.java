package com.xworkz.EmployeeDetails.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component

@RequestMapping("/")
public class EmployeeInformation {
	
	
	public EmployeeInformation() {

	System.out.println("Default Employee Informatuion Running ");
	
	}
	
	@RequestMapping("/EmployeeDetails.employee")
	public String OnStartingEmployeeDetails()
	{
		System.out.println("OnStartingEmployeeDetails is Running");
		return "EmployeeFile.html";
	}
	
	
	
	

}

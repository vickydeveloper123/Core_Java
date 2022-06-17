package com.xworkz.EmployeeDetails.bean;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class EmployeeInformation {

	public EmployeeInformation() {

		System.out.println("Default Employee Information Running ");

	}

	/*
	 * @RequestMapping("/EmployeeDetailsss.employee") public String
	 * OnStartingEmployeeDetails(@RequestParam String name, @RequestParam int age,
	 * 
	 * @RequestParam boolean working) {
	 * System.out.println("OnStartingEmployeeDetails is Running");
	 * System.out.println(name); System.out.println(age);
	 * System.out.println(working); return "EmployeeFile.html";
	 * 
	 * }
	 */

	@RequestMapping("/EmployeeDetails.employee")
	public String OnEmployeeLogInForm(@RequestParam("empName") String empName,@RequestParam int age,@RequestParam String email, @RequestParam String password, @RequestParam String address, Model model) {
		System.out.println("On Employee Log In Form is Running");

		System.out.println(empName);
		System.out.println(age);
		System.out.println(email);
		System.out.println(password);
		System.out.println(address);
		model.addAttribute("name", empName);
		model.addAttribute("age", age);
		model.addAttribute("email", email);
		model.addAttribute("password", password);
		model.addAttribute("address", address);

		return "Employee.jsp";
	}

}

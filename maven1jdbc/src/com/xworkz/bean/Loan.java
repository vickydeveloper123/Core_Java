package com.xworkz.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class Loan {
	
	@NonNull private String provider;
	@NonNull private Salary salary;
	
	
	public boolean sanction()
	{
		System.out.println("Running loan sanction Method");
		
		if(salary!=null)
			System.out.println("printing salary details in loan"+salary);
		{
			if(salary.getExistingSalary()>500 && salary.getGrossSalary()>700 && salary.getNetSalary()>1000)
			{
				System.out.println("Eligible for loan");
				return true;
			}
			else
			{
				System.out.println("Not eligible for loan");
			}
			
		}
		return false;
		
	
		
		
		
		
	}
	
	

}

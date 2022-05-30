package com.xworkz.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString


public class Salary {
	
	
	@NonNull private Double netSalary;
	@NonNull private Double grossSalary;
	@Setter private Double existingSalary;
	
	
	  public Double getExistingSalary()
	  {
		  return existingSalary;
		  
	  }
	  
	  public Double getGrossSalary() 
	  { 
		  return grossSalary; 
		  } public Double
	  getNetSalary() { return netSalary; }
	 
	

}

package com.xworkz.SerializationandDeserialization;

import java.io.Serializable;

public class Company implements Serializable{
	
	public String companyName;
	public String empName;
	public String location;
	public Company(String companyName, String empName, String location) {
		super();
		this.companyName = companyName;
		this.empName = empName;
		this.location = location;
	}
	
	
	
	
	
	
	

}

package com.xworkz.interfaces.dto;
import com.xworkz.interfaces.dto.*;

import java.io.Serializable;

public class StateDTO implements Serializable{

	private int id;//>0 < 2000
	private String name;//min 3 , max 40
	private int noOfDistricts; //>0 , <100
	
	public StateDTO() {

	System.out.println("DEFAULT CONSTRUCTOR RUNNING IN StateDTO"+this.getClass().getSimpleName());//get class is fqn and name is simply name
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		
		if(id>0 && id<2000)
		{
			System.out.println("The id is set"+id);
			return ;
		}
		else
		{
			System.out.println("The id is not valid");
		}
		
		this.id = id;
	}

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		if(name.length()>3 && name.length()<40)
		{
			System.out.println("the name is valid"+name);
			return;
		}
		else
		{
			System.out.println("the name is invalid");
		}
		
		this.name = name;
	}

	public int getNoOfDistricts() {
		return noOfDistricts;
	}

	public void setNoOfDistricts(int noOfDistricts) {
		if(noOfDistricts>0 && noOfDistricts<100)
		{
			System.out.println("The districts are valid"+noOfDistricts);
			return;
		}
		else
		{
			System.out.println("The districts are invalid");
		}
		
		this.noOfDistricts = noOfDistricts;
	}
	
	
	
	
	
	
	
}
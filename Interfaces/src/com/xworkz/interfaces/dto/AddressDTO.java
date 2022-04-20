package com.xworkz.interfaces.dto;

import java.io.Serializable;

public class AddressDTO implements Serializable{

	private int id;// >0 <1000
	private String street;//min 2 , max 100
	private String doorNo;//min 1
	private int pincode;// 6 digits 
	private StateDTO stateDTO;// valid state 
	
	
	public AddressDTO() {

	System.out.println("Default Address DTO constructor"+this.getClass().getSimpleName());
	
	}
	
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		
		if(id>0 && id <1000)
		{
			System.out.println("The id is set"+id);
			return ;
		}
		else
		{
			System.out.println("the id is not valid");
		}
		
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		if(street.length()>2 && street.length()<1000)
		{
			System.out.println("The street is set"+street);
			return;
		}
		else
		{
			System.out.println("the street is not valid");
		}
		
		this.street = street;
	}
	
	
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		
		if(doorNo.length()>1)
		{
			System.out.println("The door number is set");
			return;
		}
		
		
		this.doorNo = doorNo;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		
		if(String.valueOf(pincode).length()==6)
		{
			System.out.println("pin code is valid "+pincode);
			return;
		}
		else
		{
			System.out.println("pin code is invalid");
		}
		
		
		this.pincode = pincode;
	}
	public StateDTO getStateDTO() {
		return stateDTO;
	}
	public void setStateDTO(StateDTO stateDTO) {
		
		if(stateDTO!=null)
		{
			this.stateDTO = stateDTO;
		}

	}
}
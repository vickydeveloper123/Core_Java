package com.xworkz.interfaces.dto;

import java.io.Serializable;

import com.xworkz.interfaces.constants.CustomerType;

public class CustomerDTO implements Serializable {

	public static final int length = 0;
	private int id;
	private String name;
	private int customerId;
	private long mobile;
	private long alternativeMobile;
	private String email;
	private CustomerType customerType;
	private String alternativeEmail;
	private AddressDTO addressDTO;
	
	
	public CustomerDTO() {
	
		System.out.println("default constructor for customer dto "+this.getClass().getSimpleName());
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public long getAlternativeMobile() {
		return alternativeMobile;
	}
	public void setAlternativeMobile(long alternativeMobile) {
		this.alternativeMobile = alternativeMobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public CustomerType getCustomerType() {
		return customerType;
	}
	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}
	public String getAlternativeEmail() {
		return alternativeEmail;
	}
	public void setAlternativeEmail(String alternativeEmail) {
		this.alternativeEmail = alternativeEmail;
	}
	public AddressDTO getAddressDTO() {
		return addressDTO;
	}
	public void setAddressDTO(AddressDTO addressDTO) {
		this.addressDTO = addressDTO;
	}
}

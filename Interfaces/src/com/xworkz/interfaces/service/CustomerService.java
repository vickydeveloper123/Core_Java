package com.xworkz.interfaces.service;

import com.xworkz.interfaces.dto.CustomerDTO;

public interface CustomerService {

	boolean validateAndSave(CustomerDTO customerDTO);

	CustomerDTO findByName(String name);
	
	
	
	
	
}
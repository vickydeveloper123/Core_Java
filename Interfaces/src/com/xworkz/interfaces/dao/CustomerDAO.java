package com.xworkz.interfaces.dao;

import com.xworkz.interfaces.dto.CustomerDTO;

public interface CustomerDAO {
	

	boolean save(CustomerDTO customerDTO);

	CustomerDTO findByName(String name);

	boolean findDTO(CustomerDTO customerDTO);
	
	

}

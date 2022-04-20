package com.xworkz.interfaces.service;

import com.xworkz.interfaces.constants.CustomerType;
import com.xworkz.interfaces.dao.CustomerDAO;
import com.xworkz.interfaces.dao.CustomerDAOImpl;
import com.xworkz.interfaces.dto.AddressDTO;
import com.xworkz.interfaces.dto.CustomerDTO;
import com.xworkz.interfaces.dto.StateDTO;

public class CustomerRunner {

	// team work --->  
	
	public static void main(String[] args) {
		
		CustomerDAO customerDAO=null;// new CustomerDAOImpl();
		
		CustomerDAO customerdao=new CustomerDAOImpl();
		
		customerdao.findByName("SRI VIGNESH");
		customerdao.save(null);
		
		
			
		StateDTO statedto=new StateDTO();
		
		statedto.setId(1011);
		statedto.setName("BANGLORE");
		statedto.setNoOfDistricts(14);
		
		
		
		
		AddressDTO addressdto=new AddressDTO();
		addressdto.setId(124);
		addressdto.setStreet("ZP COLONY");
		addressdto.setStateDTO(statedto);
		addressdto.setDoorNo("1234");
		addressdto.setPincode(524004);
		
		CustomerDTO customerdto=new CustomerDTO();
		customerdto.setAddressDTO(addressdto);
		customerdto.setAlternativeEmail("srivignesh123@gmail.com");
		customerdto.setAlternativeMobile(91825666);
		customerdto.setCustomerId(1022);
		customerdto.setCustomerType(CustomerType.GOLD);
		customerdto.setId(1034);
		customerdto.setMobile(913254335);
		customerdto.setName("HONEY");
		customerdto.setEmail("vickybhai@gmail.com");
		
		System.out.println(customerdto.getAlternativeEmail());
		System.out.println(customerdto.getAlternativeMobile());
		System.out.println(customerdto.getCustomerId());
		System.out.println(customerdto.getEmail());
		System.out.println(customerdto.getId());
		System.out.println(customerdto.getMobile());
		System.out.println(customerdto.getName());
		System.out.println(customerdto.getAddressDTO());
		System.out.println(customerdto.getCustomerType());
		
		
		
		CustomerService customerService=null;//new CustomerServiceImpl(customerDAO);
		CustomerService customerServices=new CustomerServiceImpl(customerDAO);
		
		CustomerDTO foundByName=customerServices.findByName("PRABHAS");
		System.out.println(foundByName);
		
		StateDTO stateDTO=null;
		//init all variables		
		AddressDTO addressDTO=null;
		//init all variables
		//addressDTO.setStateDTO(stateDTO);
		CustomerDTO customerDTO=null;
		//init all variables inclusing addressDTO
		//customerDTO.setAddressDTO(addressDTO)
		
		customerService.validateAndSave(customerDTO);
		

	}

}

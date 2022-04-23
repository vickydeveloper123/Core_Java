package com.xworkz.interfaces.service;

import com.xworkz.interfaces.dao.CustomerDAO;


import com.xworkz.interfaces.dto.CustomerDTO;

public class CustomerServiceImpl implements CustomerService{
	
	
	private CustomerDAO customerDAO;
	
	private CustomerDTO[] customerDTOS=new CustomerDTO[10];
	
	private int counter=0;
	
	
	
	public CustomerServiceImpl(CustomerDAO customerDAO)
	{
		
		if(customerDAO!=null)
		{
			this.customerDAO=customerDAO;
			System.out.println("Generated CustomerServiceImpl constructor "+this.getClass().getSimpleName());
			return;
		}
		else
		{
			System.out.println("cannot generate constructor because reference customerDAO it is null");
		}
	}
	
	

	@Override
	public boolean validateAndSave(CustomerDTO customerDTO) {
		
		
		
		if(customerDTO!=null)
		{
			if(customerDTO.getId()<=0)
			{
				System.err.println("id is incorrect");
				return false;
			}
			
			
			if(customerDTO.getName()==null || customerDTO.getName().length()<=3 ||customerDTO.getName().length()>50)
			{
				
               System.err.println("name is incorrect");
				return false;
				
			}
			
			if(customerDTO.getCustomerId()>0)
			{

	               System.err.println("id is incorrect");
					return false;
					
				
			}
			
			if(customerDTO.getCustomerId()>=0 || customerDTO.getCustomerId()<=10 )
			{
				 System.err.println("id is incorrect");
					return false;
					
			}
			
			if(String.valueOf(customerDTO.getMobile()).length()!=0 
					|| String.valueOf(customerDTO.getMobile()).length()<=10 )
				
			{
				System.err.println("mobile is incorrect");
				return false;
			}
			
			if(String.valueOf(customerDTO.getAlternativeMobile()).length()!=0 ||  
					String.valueOf(customerDTO.getAlternativeMobile()).length()<=0)
			{
				System.err.println("alternative mobile no is incorrect");
				return false;
			}
			
			if(customerDTO.getEmail().length()!=0 || customerDTO.getEmail().length()<=10 || customerDTO.getEmail().contains("@") 
			    ||  customerDTO.getEmail().endsWith("edu.in") || customerDTO.getEmail().endsWith("com.in") 
			    || customerDTO.getEmail().endsWith("org.in"))
			    		
			{

				System.err.println("email is incorrect");
				return false;
			}
			
			if(customerDTO.getCustomerType().PREMIER!=null || customerDTO.getCustomerType().GOLD!=null
					|| customerDTO.getCustomerType().SILVER!=null)
			{
				System.err.println("customer type is incorrect");
				return false;
			}
				
			if(customerDTO.getAlternativeEmail().length()<=0 || customerDTO.getAlternativeEmail().length()<=10
					||customerDTO.getAlternativeEmail().endsWith("edu.in") || customerDTO.getAlternativeEmail().endsWith("org,in")
					
				    ||customerDTO.getAlternativeEmail().contains("@"))
			{
				
				System.out.println("Alternative email is incorrect");
				return false;
				
			}
			
			if(customerDTO.getAddressDTO()==null)
			{
				System.out.println("customerAddress DTO is incorrect ");
				return false;
			}
			boolean found=customerDAO.findDTO(customerDTO);
			if(found)
			{
				System.out.println("cannot be added customer DTO values");
				return false;
			}
			else
			{
				System.out.println("can be added customer DTO values");
				customerDAO.save(customerDTO);
				return true;
			}
			
			
			
			
			
			
		}
		
		System.out.println("Customer DTO is null cannot be added");
		return false;
		
		

		
		
		
		
	}

	@Override
	public CustomerDTO findByName(String name) {

		if(customerDTOS!=null) {
			for(int i=0; i<name.length(); i++)
			if(this.customerDTOS[counter]!=null && this.customerDTOS[counter].equals(customerDTOS)) {
				System.out.println("DTO is found");
				return customerDTOS[counter];
			}
		}
		System.out.println("DTO is  not found");
		return customerDTOS[counter];
	

}
}

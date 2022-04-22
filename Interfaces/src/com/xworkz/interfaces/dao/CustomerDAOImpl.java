package com.xworkz.interfaces.dao;

import com.xworkz.interfaces.dto.CustomerDTO;

public class CustomerDAOImpl implements CustomerDAO {
	
	
	protected CustomerDTO[] customerDTO=new CustomerDTO[10];
	protected int index=0;

	@Override
	public boolean save(CustomerDTO customerDTO) {

		if(customerDTO!=null)
		{
			if(index<this.customerDTO.length)
			{
				
				
				this.customerDTO[index]=customerDTO;
				this.index++;
				return true;
			}
			else
			{
				System.out.println("Here the index is full in the array so it cannot be added");
				return false;
			}
		}
		
		
		
		return true;
	}

	@Override
	public CustomerDTO findByName(String name) {

		if(name!=null)
		{
			if(this.customerDTO[index]!=null && this.customerDTO[index].getName().equals(name)  )

                   {
                	   System.out.println("CustomerDTO find by name @"+name);
                	   return customerDTO[index];
	
                   }

			
		}
		return null;
	}

	@Override
	public boolean findDTO(CustomerDTO customerDTO) {

		if(customerDTO!=null)
		{
			for(int i=0;i<customerDTO.length;i++)
			{
				if(this.customerDTO[i]!=null && this.customerDTO[i].getAddressDTO().equals(customerDTO))
				{
					System.out.println("Customer is found at @ "+customerDTO);
					return true;
				}
				else
				{
					System.out.println("CustomerDTO is not found  @");
				}
				
			}
		}
		
		return false;
	}

	

}

package com.xworkz.expenditure.dao;

import com.xworkz.expenditure.dto.ExpenditureDTO;

public class  ExpenditureImplementationDAO extends ExpenditureDAO{
	
	//ExpenditureDTO cannot be resolved to a type it means we are not importing 



	public void updateByPersonName(String personName,ExpenditureDTO dtoToUpdate)
	{
		if(personName!=null && dtoToUpdate!=null)
		{
			System.out.println("Running update by person name");
			ExpenditureDTO[] arrayFromParent=super.getExpenditureDTOs();
			for(int i=0;i<arrayFromParent.length;i++)
			{
				ExpenditureDTO expenditureDTO=arrayFromParent[i];
				if(expenditureDTO!=null && expenditureDTO.getPersonName().equals(personName))
				{
					System.out.println("Updated to "+i);
					arrayFromParent[i]=dtoToUpdate;
					
				}
			}
		}
	}
	
	
	
	public void deleteByPersonName(String personName)
	{
		if(personName!=null)
		{
			ExpenditureDTO[] dtos=super.getExpenditureDTOs();
			
			for(int i=0;i<dtos.length;i++)
			{
				ExpenditureDTO expenditureDTO=dtos[i];
				if(expenditureDTO!=null && expenditureDTO.getPersonName().equals(personName))
				{
					System.out.println("Index to be deleted"+i);
					dtos[i]=null;
				}
			}
		}
		
		
		
		
		
		
	}
}

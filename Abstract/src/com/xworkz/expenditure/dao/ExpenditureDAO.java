package com.xworkz.expenditure.dao;
import com.xworkz.expenditure.dto.ExpenditureDTO;

public abstract class  ExpenditureDAO {
	
	
	private ExpenditureDTO[] expenditureDTOs=new ExpenditureDTO[20];
	 private int expenditureIndex=0;
	
	
	public ExpenditureDAO() {


		System.out.println("Created Expenditure DAO");
	}

	public boolean create(ExpenditureDTO dto)
	{
		if(dto==null)
		{
			return false;
		}
		System.out.println("invoked created expenditure");
		
		if(expenditureIndex <this.expenditureDTOs.length) {
			this.expenditureDTOs[expenditureIndex]=dto;
			expenditureIndex++;
			System.out.println("Expenditure added @"+this.expenditureIndex);
			return true;
		}
		else {
			System.err.println("Expenditure Index is FULL");
		}
		
		
		
		return false;
	}
	
	public ExpenditureDTO[] getExpenditureDTOs() {
		return expenditureDTOs;
	}
	
	
	public int expendituresCount()
	{
		int count=0;
		for(int index=0; index<expenditureDTOs.length;index++)
		{
			if(expenditureDTOs[index]!=null)
			{
				count++;
			}
			
		
			
		}
		return count;
	}
	

	
	
	
	
	
	
	
	
}

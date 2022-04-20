package com.xworkz.criminals;

public class CriminalRunner {
	
	public static void main(String[] args)
	{
		CriminalDAO criminaldao= new Criminal();
		criminaldao.save(null);
		
		CriminalService criminalservice=new CriminalService(criminaldao);
		
		CriminalDTO dto=new CriminalDTO();
		dto.setId("419");
		dto.setName("MOHAMMED ALI JINNAH");
		dto.setJailName("TIHAR");
		dto.setImprisonment(14);
		dto.setOffense(1000000.000);
		criminaldao.save(dto);
		
		criminalservice.validateAndSave(dto);
		
		
		
		
		
		
		
		
		
		
	}

}

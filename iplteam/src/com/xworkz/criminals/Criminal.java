package com.xworkz.criminals;
import  com.xworkz.criminals.CriminalDAO;
import  com.xworkz.criminals.CriminalDTO;

public class Criminal implements CriminalDAO {

	@Override
	public boolean save(CriminalDTO dto) {

		System.out.println("Implenting methods from the criminalDAO");
		
		
		
		return true;
	}
	
	
	
	
	
	
	
	

}

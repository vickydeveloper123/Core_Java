package com.xworkz.interfaces.runner;
import java.util.List;

import com.xworkz.interfaces.dao.PoliticalDAO;
import com.xworkz.interfaces.dao.PoliticalDAOImplementor;
import com.xworkz.interfaces.dao.PoliticalService;
import com.xworkz.interfaces.dao.PoliticalServiceImplementation;
import com.xworkz.interfaces.dto.PoliticalPartyDTO;


public class PoliticsRunner {

	public static void main(String[] args)
	{
		
		PoliticalDAO  politicalDAOs=new PoliticalDAOImplementor();
		
		PoliticalService politicalSercvices=new PoliticalServiceImplementation(politicalDAOs);
		
		PoliticalPartyDTO politicalPartyDTO1=new PoliticalPartyDTO(111,"YSRCP","JAGAN MOHAN REDDY","YSRCP",155);
		PoliticalPartyDTO politicalPartyDTO2=new PoliticalPartyDTO(222,"TELUGU DESAM PARTY","NARA CHANDRA BABU NAIDU","TELUGUDESAM",30);
		PoliticalPartyDTO politicalPartyDTO3=new PoliticalPartyDTO(333,"CONGRESS","RAHUL GANDHI","CONGRESS",55);
		PoliticalPartyDTO politicalPartyDTO4=new PoliticalPartyDTO(444,"BHARATIYA JANATA PARTY","SRI VIGNESH","BJP",45);
		PoliticalPartyDTO politicalPartyDTO5=new PoliticalPartyDTO(555,"vaikapa","sunil yadav","vaikapa",15);
		
		
		
	
		
		
		politicalSercvices.validateandsave(politicalPartyDTO1);
		politicalSercvices.validateandsave(politicalPartyDTO2);
		politicalSercvices.validateandsave(politicalPartyDTO3);
		politicalSercvices.validateandsave(politicalPartyDTO4);
		politicalSercvices.validateandsave(politicalPartyDTO5);
		
		
		
		
		politicalSercvices.deleteByName("vignesh");
		
		politicalSercvices.validateandsave(politicalPartyDTO1);

		
		PoliticalDAOImplementor daoImplementer=new PoliticalDAOImplementor();
		
		
		  daoImplementer.deleteByName("VIGNESH");
		  
		  daoImplementer.save(politicalPartyDTO1);
	
		  
		  System.out.println("============================");
		  System.out.println("Sorting by using comparater");
		  
		  System.out.println("Sorting  By Name");
		  
		  List<PoliticalPartyDTO> sortingtechnique=politicalSercvices.sortByName();
		  
		  System.out.println("Sorting by poltical names"+ " "+sortingtechnique);
		  
		  List<PoliticalPartyDTO> sortingtechniquee=politicalSercvices.sortById();
		  System.out.println("Sorting by political id =="+" "+sortingtechniquee);
		  
		  List<PoliticalPartyDTO> sortingtechniqueee=politicalSercvices.sortByNameAndId();
		  System.out.println("Sorting by political Name and Id =="+" "+sortingtechniqueee);
		  
		  
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}

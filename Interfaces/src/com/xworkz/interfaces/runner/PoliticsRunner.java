package com.xworkz.interfaces.runner;
import com.xworkz.interfaces.dao.PoliticalDAO;
import com.xworkz.interfaces.dao.PoliticalDAOImplementor;
import com.xworkz.interfaces.dao.PoliticalService;
import com.xworkz.interfaces.dto.PoliticalPartyDTO;


public class PoliticsRunner {

	public static void main(String[] args)
	{
		
		PoliticalDAO  politicalDAOs=new PoliticalDAOImplementor();
		
		PoliticalService politicalSercvices=new PoliticalService(politicalDAOs);
		
		PoliticalPartyDTO politicalPartyDTO1=new PoliticalPartyDTO(111,"YSRCP","JAGAN MOHAN REDDY","YSRCP",155);
		PoliticalPartyDTO politicalPartyDTO2=new PoliticalPartyDTO(222,"TELUGU DESAM PARTY","NARA CHANDRA BABU NAIDU","TELUGUDESAM",30);
		PoliticalPartyDTO politicalPartyDTO3=new PoliticalPartyDTO(333,"CONGRESS","RAHUL GANDHI","CONGRESS",55);
		PoliticalPartyDTO politicalPartyDTO4=new PoliticalPartyDTO(444,"BHARATIYA JANATA PARTY","SRI VIGNESH","BJP",45);
		PoliticalPartyDTO politicalPartyDTO5=new PoliticalPartyDTO(555,"vaikapa","sunil yadav","vaikapa",15);
		
		politicalSercvices.deletebyName("vignesh");
		politicalSercvices.validateandsave(politicalPartyDTO1);
		politicalSercvices.validateandsave(politicalPartyDTO2);
		politicalSercvices.validateandsave(politicalPartyDTO3);
		politicalSercvices.validateandsave(politicalPartyDTO4);
		politicalSercvices.validateandsave(politicalPartyDTO5);
		
		PoliticalDAOImplementor daoImplementer=new PoliticalDAOImplementor();
		
 
		daoImplementer.addingDTOelementsTOcollection(politicalPartyDTO1);
		daoImplementer.addingDTOelementsTOcollection(politicalPartyDTO2);
		daoImplementer.addingDTOelementsTOcollection(politicalPartyDTO3);
		daoImplementer.addingDTOelementsTOcollection(politicalPartyDTO4);
		daoImplementer.addingDTOelementsTOcollection(politicalPartyDTO5);
		
		daoImplementer.save(politicalPartyDTO1);
		daoImplementer.save(politicalPartyDTO2);
		daoImplementer.save(politicalPartyDTO3);
		daoImplementer.save(politicalPartyDTO4);
		daoImplementer.save(politicalPartyDTO5);
		
		
		daoImplementer.iterater();
		
		daoImplementer.deleteByName("RAHUL");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}

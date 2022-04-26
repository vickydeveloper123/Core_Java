package com.xworkz.interfaces.dao;

import com.xworkz.interfaces.dto.PoliticalPartyDTO;

public class PoliticalService {
	
	
	
	 private PoliticalDAO dao;

	public PoliticalService(PoliticalDAO dao) {
		super();
		this.dao = dao;
	}
	   public  void  validateandsave(PoliticalPartyDTO dto)
	    {
	    	if(dto!=null)
	    	{
	    		if(dto.getId()>=0 &&(dto.getName().length()>3 && dto.getName().length()<50 )&& dto.getNoOfMps()>=0 && (dto.getNationalParty().length()>3 && dto.getNationalParty().length()<50) )
	    		{
	    			dao.save(dto);
	    		}
	    	}
	    }
	   public   void deletebyName(String name)
	     {
	    	if(name!=null)
	    	{
	    		dao.deleteByName(name);
	    	}
	     }
	  

	}
	



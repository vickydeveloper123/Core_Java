package com.xworkz.interfaces.dao;

import java.util.Collection;
import java.util.List;


import com.xworkz.interfaces.dto.PoliticalPartyDTO;

public interface PoliticalService {

	


		
		   public  void  validateandsave(PoliticalPartyDTO dto);
		   
		   public void deleteByName(String name);
		   
		   List<PoliticalPartyDTO> sortByName();

			List<PoliticalPartyDTO> sortById();

			List<PoliticalPartyDTO> sortByNameAndId();


		   
		  

}

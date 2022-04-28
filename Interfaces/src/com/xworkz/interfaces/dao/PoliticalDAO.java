package com.xworkz.interfaces.dao;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.interfaces.dto.PoliticalPartyDTO;

public interface PoliticalDAO  {
	
	 	
	
	
	   boolean save(PoliticalPartyDTO dto);
       void deleteByName(String name);

       
       List<PoliticalPartyDTO> sort(Comparator<PoliticalPartyDTO> comparator) ;
   	

}

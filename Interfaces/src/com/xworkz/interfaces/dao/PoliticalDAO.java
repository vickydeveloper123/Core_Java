package com.xworkz.interfaces.dao;

import java.util.LinkedList;

import com.xworkz.interfaces.dto.PoliticalPartyDTO;

public interface PoliticalDAO  {
	
	 	
	LinkedList<String> list=new LinkedList<String>();
	
	   boolean save(PoliticalPartyDTO dto);
       void deleteByName(String name);


}

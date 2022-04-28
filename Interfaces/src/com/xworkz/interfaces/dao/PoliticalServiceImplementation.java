package com.xworkz.interfaces.dao;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import com.xworkz.interfaces.dto.*;
import com.xworkz.interfaces.runner.*;
import com.xworkz.interfaces.sorting.PoliticalPartyById;
import com.xworkz.interfaces.sorting.PoliticalPartyByName;
import com.xworkz.interfaces.sorting.PoliticalPartyNameandId;
import com.xworkz.interfaces.dto.PoliticalPartyDTO;

public class PoliticalServiceImplementation implements PoliticalService {


private PoliticalDAO dao;

public PoliticalServiceImplementation(PoliticalDAO dao) {
	super();
	this.dao = dao;
}

@Override
   public  void  validateandsave(PoliticalPartyDTO dto)
    {
    	if(dto!=null)
    	{
    		if(dto.getId()>=0 &&(dto.getName().length()>3 && dto.getName().length()<50 )&& 
    				dto.getNoOfMps()>=0 && (dto.getNationalParty().length()>3 &&
    						dto.getNationalParty().length()<50) )
    		{
    			dao.save(dto);
    		}
    	}
    }
  
@Override
public void deleteByName(String name) {

	if(name!=null)
	{
		dao.deleteByName(name);
		System.out.println("Deleting name=="+name);
	}
}

@Override
public List<PoliticalPartyDTO> sortByName() {

	Comparator<PoliticalPartyDTO> sortName=new PoliticalPartyByName();
	return dao.sort(sortName) ;	
	
	
}

@Override
public List<PoliticalPartyDTO> sortById() {
	
	Comparator<PoliticalPartyDTO> sortById=new PoliticalPartyById();
	return dao.sort(sortById);

	}

@Override
public List<PoliticalPartyDTO> sortByNameAndId() {

	Comparator<PoliticalPartyDTO> sortByNameandId=new PoliticalPartyNameandId();
	
	
	return dao.sort(sortByNameandId);
}

































}

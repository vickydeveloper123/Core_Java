package com.xworkz.interfaces.sorting;
import java.util.Comparator;
import com.xworkz.interfaces.dto.PoliticalPartyDTO;

public class PoliticalPartyNameandId implements Comparator<PoliticalPartyDTO> {

	@Override
	public int compare(PoliticalPartyDTO o1, PoliticalPartyDTO o2) {

		Integer id1=o1.getId();
		Integer id2=o2.getId();
		
		id1.compareTo(id2);		
		
		
		return o1.getName().compareTo(o2.getName());
	}
	
	
	

}

package com.xworkz.interfaces.sorting;
import java.util.Comparator;

import com.xworkz.interfaces.dto.PoliticalPartyDTO;

public class PoliticalPartyByName implements Comparator<PoliticalPartyDTO>{

	@Override
	public int compare(PoliticalPartyDTO o1, PoliticalPartyDTO o2) {

		return o1.getName().compareTo(o2.getName());
	}

}

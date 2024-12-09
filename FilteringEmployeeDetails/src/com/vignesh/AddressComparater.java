package com.vignesh;

import java.util.Comparator;

public class AddressComparater implements Comparator<Employers>{

	@Override
	public int compare(Employers o1, Employers o2) {
		return o1.getAddress().compareTo(o2.getAddress());
	}
	

}

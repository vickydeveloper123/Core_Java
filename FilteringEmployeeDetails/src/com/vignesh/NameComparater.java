package com.vignesh;

import java.util.Comparator;

public class NameComparater implements Comparator<Employers>{

	@Override
	public int compare(Employers o1, Employers o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}

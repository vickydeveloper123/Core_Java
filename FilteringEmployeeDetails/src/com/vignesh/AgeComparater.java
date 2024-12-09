package com.vignesh;

import java.util.Comparator;

public class AgeComparater implements Comparator<Employers> {

	@Override
	public int compare(Employers o1, Employers o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}



}

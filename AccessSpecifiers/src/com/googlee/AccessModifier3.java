package com.googlee;

import com.google.AcessModifier1;

public class AccessModifier3 extends AcessModifier1 {
public static void main(String[] args) {
	
	//protected acess modifier by ectends keyword
	

	AccessModifier3 reference=new AccessModifier3();
	System.out.println(reference.name);
	System.out.println(reference.Designation);
	System.out.println(reference.salary);
	System.out.println(reference.pincCode);
}

}


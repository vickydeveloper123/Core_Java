package com.google;

public class AcessModifier1 {

	// Public ,default,private,protected,protected(inheritance)
	// private == Acessible within the same class

	/*
	 * public String name="Swetha"; public String Designation="Software Developer";
	 * public int salary=500000;
	 */

	protected  String name = "Swetha";
	protected String Designation = "Software Developer";
	protected int salary = 500000;
 	protected double pincCode = 560091.0;//no 
	
	public static void main(String[] args) {
		AcessModifier1 reference=new AcessModifier1();
		System.out.println(reference.name);
		System.out.println(reference.Designation);
		System.out.println(reference.salary);
		System.out.println(reference.pincCode);
	}

}

package com.singletonDesignPattern.java;

public class Synchronised {
	
	private static Synchronised instance=null;
	
	private Synchronised() {
		System.out.println("Default constructor from synchronised");
	}
	
	public static synchronized Synchronised getInstance() { 
		if(instance==null) {
			instance=new Synchronised();
		}
		
		return instance;
	}

}

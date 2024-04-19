package com.singletonDesignPattern.java;

public class LazyIntialisation {
	
	private static LazyIntialisation instance=null;
	
	private LazyIntialisation() {
		System.out.println("Private default constructor lazy");
	}
	
	public static LazyIntialisation getInstance() {
		
		if(instance==null) {
			instance=new LazyIntialisation();
		}
		return instance;
	}

}

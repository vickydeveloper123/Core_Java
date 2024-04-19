package com.singletonDesignPattern.java;

public class BillPushSingleton {
	
	
	private BillPushSingleton() {
		System.out.println("Default constructor from synchronised");
	}
	
	private static class SingletonHelper{
		private static  BillPushSingleton instance=new BillPushSingleton();
	}
	public static  BillPushSingleton getInstance() { 
		
		return SingletonHelper.instance;
	}


}

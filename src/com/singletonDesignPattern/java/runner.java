package com.singletonDesignPattern.java;

public class runner {

	public static void main(String[] args) {
		BillPushSingleton obj1 = BillPushSingleton.getInstance();
		BillPushSingleton obj2 = BillPushSingleton.getInstance();

		if (obj1 == obj2) {
			System.out.println("Object are same");
			System.out.println();
		} else {
			System.out.println("Object are not same");

		}
	}

}

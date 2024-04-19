package com.singletonDesignPattern.java;

public class StaticRunner {

	public static void main(String[] args) {

		StaticBlockIntialisation obj1 = StaticBlockIntialisation.getInstance();
		StaticBlockIntialisation obj2 = StaticBlockIntialisation.getInstance();

		if (obj1 == obj2) {
			System.out.println("Here both the objects are same");
		} else {
			System.out.println("Both the objects are not same");
		}

	}

}

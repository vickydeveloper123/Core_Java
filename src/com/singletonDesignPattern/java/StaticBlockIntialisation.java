package com.singletonDesignPattern.java;

public class StaticBlockIntialisation {

	private static StaticBlockIntialisation instance = null;

	private StaticBlockIntialisation() {
		System.out.println("Default private Static Block Singleton");
	}

	static {
		try {
			instance = new StaticBlockIntialisation();
		} catch (Exception e) {
			System.out.println("Handling thorugh exceptions using static block");
		}
	}

	public static StaticBlockIntialisation getInstance() {
		return instance;
	}

}


// Exception handling objects are always created.

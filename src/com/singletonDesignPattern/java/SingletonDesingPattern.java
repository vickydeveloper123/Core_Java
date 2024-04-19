package com.singletonDesignPattern.java;

public class SingletonDesingPattern {

	private static SingletonDesingPattern instance;

	private SingletonDesingPattern() {
		// Private singleton constructor helps us to prevent instantiation of object.
	}

	public static SingletonDesingPattern getInstance() {

		if (instance == null) {
			instance = new SingletonDesingPattern();
		}
		return instance;

	}

	public void showMessage() {
		System.out.println("Hello Team This is the instance method from Singleton Design pattern class");
	}

}

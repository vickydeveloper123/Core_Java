package com.singletonDesignPattern.java;

public class EagerIntialisationSingleTon {

	private static EagerIntialisationSingleTon instancee = new EagerIntialisationSingleTon();

	private EagerIntialisationSingleTon() {
		System.out.println("Default singleton constructor running ");
	}

	public static EagerIntialisationSingleTon getInstance() {

		return instancee;
	}

	

}

 // Here only one object is created, multithreading is not allowed.
package com.singletonDesignPattern.java;

public class SynchornisedRunner {

	public static void main(String[] args) {
		Synchronised obj1 = Synchronised.getInstance();
		Synchronised obj2 = Synchronised.getInstance();

		if (obj1 == obj2) {
			System.out.println("Objects are same");
			System.out.println("SynchornisedRunner");
		} else {
			System.out.println("Objects are not  same");

		}

	}

}

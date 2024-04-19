package com.singletonDesignPattern.java;

public class LazyRunner {

	public static void main(String[] args) {

		LazyIntialisation obj1 = LazyIntialisation.getInstance();
		LazyIntialisation obj2 = LazyIntialisation.getInstance();

		if (obj1 == obj2) {
			System.out.println("Objects are same");
			System.out.println("Lazy Runner");
		} else {
			System.out.println("Objects are not  same");

		}

	}

}

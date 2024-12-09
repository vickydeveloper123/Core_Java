package com.google;

public class StaticMethodsInJava {

	void InstanceMethod() {
		System.out.println("Hi this is instance method (Non-Static), in java");
	}

	static void method() {
		System.out.println("Static Method is Running");
	}

	public static void main(String[] args) {
		method();

		System.out.println("=====================================");
		StaticMethodsInJava nonStatic = new StaticMethodsInJava();

		nonStatic.method();
		nonStatic.InstanceMethod();

		// Here Instance method can access only static methods only in the particular
		// class,
		// While as non static method class can access by using the reference of the
		// object in the class,
		// it can access static methods and non static methods by using the reference,
		// Even the static methods can access from the other class as well.
		// Here from the other class the static methods can call directly from the other
		// class,but not the instance methods.
		
		
		

	}
}

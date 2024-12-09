package com.google;

public class StaticMethodsInJavaFromotherclass {
	public static void main(String[] args) {
		
		StaticMethodsInJavaFromotherclass ref=new StaticMethodsInJavaFromotherclass();
		StaticMethodsInJava.method(); // static method.
		
		// Here in the above class staticMethods from the other class can acess directly from other class in the same package.
		
		
		StaticMethodsInJava referenceOfOtherClass=new StaticMethodsInJava();
		referenceOfOtherClass.InstanceMethod();
		
		// Here the non-static methods can be acessed by using the same class Name, creating an object of the instance of the class.
		
	}

}

package com.xworkz.strings.stringbuilder.stringbuffer;

public class ifelseStatement {

	public static void main(String[] args) {

		int a = 8724;
		int b = 234;

		String s1 = "Vcube";
		String s2 = "Vcube";

		if (a == b)
			System.out.println(true);
		else
			System.out.println(false);

		System.out.println("================another type=================");

		if (a < b) {
			System.out.println("false");
			System.out.println("Beacause a is bigger value than b");
		}

		else
			System.out.println("a is not less than b hence a is greater");

		System.out.println("================another type=================");

		if (a > b)
			System.out.println("The given condition is true");
		else
			System.out.println("The given condition false");

		System.out.println("================another type=================");

		if (s1 == s2)
			System.out.println("THE given Strings are equal");

		else
			System.out.println("The given Strings are not not equal");

		System.out.println("================another type=================");

		if (s1 == s2) {
			System.out.println("The given Strings are equal");
			System.out.println("The Vcube number 1 software training institute for software developers");
		} else
			System.out.println("The given Strings are not equal");
	}

}
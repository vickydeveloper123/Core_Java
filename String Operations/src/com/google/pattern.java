package com.google;

public class pattern {

	public static void main(String[] args) {

		int a = 19;

		a = a++;

		System.out.println(a); // 19

		System.out.println(a);
		// ++a;

		System.out.println(++a);

		System.out.println(++a); // 20 19
		System.out.println(a++);

		System.out.println(a); // 20
		System.out.println(a = a++); // 21 19

		System.out.println(a++);

		System.out.println(a);

		System.out.println("Sample Operations for the variables.====================="); 
		int b = 10, c = 45, g;

		g = b + c;

		System.out.println("The Output for the following Output is " + ('0' + 10 + 203 + "c" + g)); // 010203c55

		System.out.println(g);

	}

}

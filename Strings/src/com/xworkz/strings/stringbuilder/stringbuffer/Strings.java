package com.xworkz.strings.stringbuilder.stringbuffer;

public class Strings {

	public static void main(String[] args) {

		String S = "VCUBE Software solutions hyderabad";
		System.out.println(S);

		long time = System.currentTimeMillis();
		StringBuilder strb = new StringBuilder("Hello");

		for (int i = 0; i <= 1000; i++) {
			strb.append("Vignesh");
		}

		System.out.println("String Builder execting in Time ==>" + (System.currentTimeMillis() - time));

		
		long timeSec = System.currentTimeMillis();
		StringBuffer strbf = new StringBuffer("Hello");

		for (int i = 0; i <= 1000; i++) {
			strb.append("Vignesh");
		}

		System.out.println("String Buffer execting in Time ==>" + (System.currentTimeMillis() - timeSec));

	}
}
package com.googlee;

import java.util.Scanner;

public class programRemoveWhiteSpaces {
	
	public static void main(String[] args) {
		


	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter ur name");
	String str=scanner.nextLine();
	
	str=str.replaceAll("\s","");
	System.out.println("After Removing White Spaces in the String"+str);

	
	
	// Remocving white Spaces in String by String Buffer.
	Scanner scan=new Scanner(System.in);
	System.out.println("Please Enter the name ===");
	
	String sss=scan.nextLine();
	
	char[] charref=sss.toCharArray();
	
	StringBuffer stringBuffer=new StringBuffer();
	for (int i = 0; i < charref.length; i++) {
		
		if((charref[i]!=' ')&(charref[i]!='\t'))
		{
			stringBuffer.append(charref[i]);
		}
		
	}
	
	String strrrr=stringBuffer.toString();
    System.out.println("Expecting NO space String ==="+strrrr);
	
	
}
}
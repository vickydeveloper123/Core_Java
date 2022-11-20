package com.googlee;

import java.util.Iterator;
import java.util.Scanner;

public class lowerToUpperCase {
	public static void main(String[] args) {

		{
			int i;
			char ch[];
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the name====");
			
			String srrr=scanner.nextLine();
			char[] charecterArray=srrr.toCharArray();
            System.out.println();
            
            for (int j = 0; j < charecterArray.length; j++) {
            	
            	if(charecterArray[j]>=97 && charecterArray[j]<=122)  {
            		
            		charecterArray[j]-=32;
            		
            	}
				
			}
            System.out.println(charecterArray);
		}

	}
}

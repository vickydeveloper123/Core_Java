package com.googlee;

import java.util.Arrays;

public class T2dArray {

	public static void main(String[] args) {

		Integer a[][] = new Integer[][] { { 1, 2, 3, 4, 5 }, { 1, 2, 4, 5, 5 } };

		System.out.println(Arrays.deepToString(a) + "======DeepToString(2D Array)");

		int aa[][] = new int[][] { { 1, 2, 3 }, { 3, 3, 3 } };
		System.out.println(Arrays.deepHashCode(aa));
		System.out.println(Arrays.deepToString(aa));
		
		String s[]=new String[] {"Vignesh","Bavitha","Saija"};
		
		for (int i = 0; i < s.length; i++) {
			
			System.out.println(s[i]);
			
		}
		
		
	}
}

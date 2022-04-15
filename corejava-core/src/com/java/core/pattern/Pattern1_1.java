package com.java.core.pattern;

public class Pattern1_1 {
	public static void main(String[] args) {
		int a= 1, sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = 0;
			for (int j = 0; j < i; j++) {
				
				System.out.print( a +"+");
				sum = sum + a ;
				a++;
			}
			System.out.println( "=" +sum);
			System.out.println();
		}
	}
}

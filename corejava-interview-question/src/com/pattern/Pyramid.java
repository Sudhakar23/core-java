package com.pattern;

public class Pyramid {
	public static void main(String[] args) {
		int i,j,k,t = 0;
		for( i=1; i<=5; i++)
		{
			for( k=t; k<5; k++){
				System.out.print("-");
			}
			for( j=0; j< i; j++){
				System.out.print(" * ");
				t = t + 1;
			}
			System.out.println();
		}
	}
}

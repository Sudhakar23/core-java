package com.java.core.pattern;

public class Pattern1 {
public static void main(String[] args) {
	int k=1;
	for (int i = 0; i <4; i++) 
	{
		for (int j = 0; j <= i; j++) 
		{
			System.out.print(k+"  ");
			k++;
		}
		System.out.println();
		
	}
}
}

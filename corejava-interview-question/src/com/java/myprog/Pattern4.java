package com.java.myprog;

public class Pattern4 {
	
	public static void main(String[] args) {
		//int a=0;
		for (int i = 1; i <=5; i++) {
			for (int j = 4; j >i; j--) {
				
				
				System.out.print("  ");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print(i+"   ");
			
			}
			System.out.println();
		}
	}
}

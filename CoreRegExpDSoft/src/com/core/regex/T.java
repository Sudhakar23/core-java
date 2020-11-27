package com.core.regex;

public class T {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 1 ; i <= 120 ; i++) {
			if( i % 2 == 0 || i % 5 == 0 || i % 7 == 0 ) {
				count ++;
			}
		}
		System.out.println(120 - count);
	}
}
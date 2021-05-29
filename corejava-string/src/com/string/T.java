package com.string;

public class T {
	public static void main(String[] args) {
		String str = "My name is sudhakar i live in #231 koramangala, may sal is 20000.0";
		String[] abc = str.split(" ");
		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
			if(abc[i] instanceof String) {
				System.out.println(abc[i]);
				
			}
		}
	}
}
package com.core.string;

public class Lab6 {
	public static void main(String[] args) {
		String str1 = "JLC";
		String str2 = "JLC";
		String str3 = "JLC";
		System.out.println(str1 == str2);
		
		String ref1 = new String("JLC");
		String ref2 = new String("JLC");
		System.out.println(ref1 == ref2);
		
	}
}
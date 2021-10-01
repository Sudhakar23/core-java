package com.string.problems;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "Test";
		String str2 = "Test";
		String str3 = new String("Test");
		String str4 = String.valueOf("Test");
		
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str1 == str4);
		System.out.println(str3 == str4);
	}
}

package com.string;

public class String01 {

	public static void main(String[] args) {
		String str1 = new String("Hi");
		String str2 = new String("H1");
		String str3 = "Hi";
		String str4 = "Hi";
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str3 == str1);
		System.out.println(str3 == str4);
//		for (String part : str.split(" ")) {
//		    System.out.print(new StringBuffer(part).reverse().toString());
//		    System.out.print(" ");
//		}
	}
}
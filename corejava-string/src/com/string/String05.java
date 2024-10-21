package com.string;

public class String05 {

	public static void main(String[] args) {
		String str = "Hello World";
		for (String part : str.split(" "))
			reverse(part);
	}

	static void reverse(String s) {
	    for (int idx = s.length() - 1; idx >= 0; idx--) 
	        System.out.print(s.charAt(idx));
	}
	
}

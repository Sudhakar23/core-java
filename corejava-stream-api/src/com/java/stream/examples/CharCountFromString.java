package com.java.stream.examples;

public class CharCountFromString {
	public static void main(String[] args) {
		String string = "India";
		
		long count = string.chars().filter(str -> str == 'i' ).count();
		System.out.println(count);
	}
}

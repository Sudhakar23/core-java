package com.string;

public class String12 {
	public String reverse(String s) {
		int length = s.length(), last = length - 1;
		char[] chars = s.toCharArray();
		for (int i = 0; i < length / 2; i++) {
			char c = chars[i];
			chars[i] = chars[last - i];
			chars[last - i] = c;
		}
		return new String(chars);
	}

	// First you need to split the string into words like this

	String sample = "hello world";
	String[] words = sample.split(" ");
}
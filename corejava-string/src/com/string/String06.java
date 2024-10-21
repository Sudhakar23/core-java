package com.string;

public class String06 {
	public static void main(String[] args) {

		String str = "Hello World";
		StringBuilder reversed = new StringBuilder();
		for (String word : str.split(" ")) {
			reversed.append(reverse(word));
			reversed.append(' ');
		}
		System.out.println(reversed);
	}

	static String reverse(String s) {
		StringBuilder b = new StringBuilder();
		for (int idx = s.length() - 1; idx >= 0; idx--)
			b.append(s.charAt(idx));
		return b.toString();
	}
}
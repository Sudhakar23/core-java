package com.string;

public class StringReverse_1 {
	public static void main(String[] args) {
		System.out.println(StringReverse_1.reverse("Hello"));
	}

	public static String reverse(String post) {
		String backward = "";
		for (int i = post.length() - 1; i >= 0; i--) {
			backward = backward + post.substring(i, i + 1);
		}
		return backward;
	}
}

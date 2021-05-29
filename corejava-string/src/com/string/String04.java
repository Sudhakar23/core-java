package com.string;

public class String04 {
	public static void main(String[] args) {
		String str = "sudhakar";
		String st = reverse(str);
		System.out.println(st);
	}

	public static String reverse(String string) {
		StringBuilder sb = new StringBuilder(string.length());
		StringBuilder wsb = new StringBuilder(string.length());
		for (int i = 0; i < string.length(); i++){
			char c = string.charAt(i);
			if (c == '\t' || c == ' ') {
				if (wsb.length() > 0) {
					sb.append(wsb.reverse().toString());
					wsb = new StringBuilder(string.length() - sb.length());
				}
				sb.append(c);
			} else {
				wsb.append(c);
			}
		}
		if (wsb.length() > 0) {
			sb.append(wsb.reverse().toString());
		}
		return sb.toString();

	}
}

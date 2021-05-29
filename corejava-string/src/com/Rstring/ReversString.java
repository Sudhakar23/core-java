package com.Rstring;

import java.util.Collections;
import java.util.HashMap;

public class ReversString {
	// static String s="";
	public static void main(String[] args) {
		String str = "MY NAME IS Sudhakar";
		for (String st : str.split(" ")) {
			m1(st);
			System.out.print(" ");
		}
	}

	static void m1(String str) {
		for (int i = str.length() - 1; i >= 0; --i) {
			System.out.print(str.charAt(i));
		}
		HashMap hp = new HashMap();
		// Collections.synchronizedCollection(hp);
	}
}

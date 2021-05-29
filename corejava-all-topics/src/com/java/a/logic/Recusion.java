package com.java.a.logic;

public class Recusion {
	public static void main(String[] args) {
		String s = "Sudhakar";
		r(s, 11);
	}

	static void r(String s, int i) {
		if (i > 0) {
			r(s, i - 1);
			System.out.println(s);
		}
	}
}
package com.java.corejava;

public class Ques03 {
	public static void main(String[] args) {
		int x = 10;
		if (x++ > 10 && x++ < 12) {
			x++;
		}
		System.out.println(x);
		/*
		 * System.out.println(x++); System.out.println(x);
		 */
	}
}

package com.java.myprog;

public class ReverseNo {
	public static void main(String[] args) {
		int a = 12345, b, c, d = 0;
		for (int i = a; i > 0; i = a) {
			b = a % 10;
			a = a / 10;
			d = d * 10 + b;

		}
		System.out.println(d);

	}
}

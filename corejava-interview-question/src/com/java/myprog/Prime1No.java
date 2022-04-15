package com.java.myprog;

public class Prime1No {
	public static void main(String[] args) {
		int a = 100;
		int count = 0;
		for (int i = 2; i < a / 2; i++) {

			if (a % i == 0) {
				count++;
			}

		}
		if (count == 0) {
			System.out.println(a + "   is prime");
		} else {
			System.out.println("nt prime");
		}
		System.out.println();
	}

}

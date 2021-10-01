package com.java.logic;

public class primeno {
	public static void main(String[] args) {
		for (int j = 0; j < 1000; j++) {
			int count = 0;
			int a = j;
			for (int i = 2; i < a / 2; i++) {
				if (a % i == 0) {
					count++;
				}
			}
			if (count == 0) {
				// System.out.println(a+"==no is not prime");
				System.out.println(a + "== no is prime");
			}
			// else
		}
	}
}

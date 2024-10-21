package com.java.myprog;

import java.util.Scanner;

public class Prime1No {
	public static void main(String[] args) {
//		int a = 100;
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			
			String token = scan.next();
			if (token.equals("q")) {
				break;
			} else {
				checkPrime(token);
			}
//			System.out.println();
		}
	}

	private static void checkPrime( String token) {
		int count = 0;
		Integer a = Integer.parseInt(token);
		if (a instanceof Integer) {
			for (int i = 2; i < a / 2; i++) {
				if (a % i == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(a + "   is prime");
			} else {
				System.out.println("not prime");
			}
		}
	}

}

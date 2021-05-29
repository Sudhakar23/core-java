package com.java.myprog;

public class Pattern3 {
	static int sum, c, d;

	public static void main(String[] args) {
		int a = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print(a + "   ");
				sum = c + a;
				d=sum+c;
				c = a++;

			}
			// int c=i+j;
			System.out.println("= " + d);

		}
	}
}

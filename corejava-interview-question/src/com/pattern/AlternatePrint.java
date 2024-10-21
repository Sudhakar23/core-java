package com.pattern;

public class AlternatePrint {
	public static void main(String args[]) {
		int i, j, a = 1;
		for (i = 0; i <= 10; i++) {
			i++;
			for (j = a; j <= i; j++) {
				int k = j % 2;
				System.out.print(k);
			}
			a++;
			System.out.println(" ");
		}
	}
}

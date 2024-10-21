package com.pattern;

class Diamond {
	public static void main(String args[]) {
		int i, j, a = 5, b = 1, c = 2, d = 3;
		for (i = 5; i >= 1; i--) {
			for (j = 5; j >= b; j--) {
				System.out.print("-");
			}
			b++;
			for (j = 5; j >= i + 1; j--) {
				System.out.print(j);
			}
			/*
			 * for (j = a; j <= 5; j++) { System.out.print(j); }
			 */
			a--;
			System.out.println(" ");
		}

		for (i = 5; i >= 1; i--) {
			for (j = 6; j >= i; j--) {

				System.out.print(" ");
			}
			for (j = 5; j >= d; j--) {
				System.out.print(j);
			}
			d++;
			for (j = c; j <= 5; j++) {
				System.out.print(j);
			}
			c++;

			System.out.println(" ");
		}

	}
}
package com.java.myprog;

public class PrimeNo2 {
	public static void main(String[] args) {
		// int i=17;
		for (int z = 100; z < 200; z++) {

			int i = z;

			int count = 0;
			for (int j = 2; j < i / 2; j++) {

				if (i % j == 0) {
					count++;
				}
			}
			if (count != 0) {
				System.out.println(z + "   nt is prime");
			} /*
				 * else { System.out.println(z +" nt prime"); }
				 */

		}
	}
}

package com.java.myprog;

public class PrimeNo {
	public static void main(String[] args) {

		// /////////
		for (int n = 1; n < 100; n++) {

			int i = n;
			int count = 0;
			String store = " ";

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					store = store + j + " ";
					count++;
					// System.out.println(j);
				}
			}

			if (count == 0) {
				System.out.println(i);
			} else {

				// System.out.println("no is nt prime" + "=="+i+" result=="+store );

			}
		}

	}
}

package com.java.a.logic;

public class MISArrayLab1_1 {
	public static void main(String[] args) {
		int[] A = {1, 2, 3, 4, 5};
		int[] B = {3, 1, 2, 5};
		int i, n = 5, sum1 = 0, sum2 = 0;
		for (i = 0; i <= n - 1; i++) {
			sum1 = sum1 + A[i];
			if (i <= n - 2) {
				sum2 = sum2 + B[i];
			}
		}
		System.out.println("Missing Element is: " + (sum1 - sum2));
	}
}

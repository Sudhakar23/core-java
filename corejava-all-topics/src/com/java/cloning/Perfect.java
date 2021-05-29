package com.java.cloning;

public class Perfect {
	public static void main(String[] args) {
		int no = 6;
		for (int j = 1; j < 100; j++) {
			int sum = 0;
//			System.out.print(j);
			for (int i = 1; i < j; i++) {
				if (j % i == 0) {
				
					sum = sum + i;
				}
			}
			if (sum == j) {
				System.out.println(j + " is perfect no");
			} else {
			//	System.out.println(j + " is not perfect no");
			}
			
		}
	}
}

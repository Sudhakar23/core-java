package com.java.logic;

import java.util.Random;

public class GenertateOTP {
	public static void main(String[] args) {
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
			System.out.print(random.nextInt(10));
		}
		System.out.println();
		
		
		//Random between two numbers 
		Random r = new Random();
		int low = 3;
		int high = 8;
		int result = r.nextInt(high-low)+low;
		System.out.println(result);
	}
}

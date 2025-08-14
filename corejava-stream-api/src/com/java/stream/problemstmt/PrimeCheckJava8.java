package com.java.stream.problemstmt;

import java.util.stream.IntStream;

public class PrimeCheckJava8 {

	public static void main(String[] args) {

		boolean check = checkPrime(7);
		System.out.println(check);
	}

	private static boolean checkPrime(int num) {
		boolean isDivisible = false;
		for(int i = 2 ; i < num ; i++) {
			if(num % i == 0) {
				isDivisible = true;
			}
		}
		
		return false; 
	}
	
	private static boolean checkPrimeStreamAPI(int num) {
		if(num <= 1)
			return false;
		
		return IntStream.rangeClosed(2, num/2).noneMatch(i -> num % i == 0);
	}

}

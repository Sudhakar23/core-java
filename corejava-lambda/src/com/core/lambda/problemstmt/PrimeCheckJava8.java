package com.core.lambda.problemstmt;

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

}

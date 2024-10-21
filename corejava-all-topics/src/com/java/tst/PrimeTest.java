package com.java.tst;

public class PrimeTest {
	public static void main(String[] args) {
		int num = 14; int count = 0;
		
		for (int i = 2; i < num/2; i++) {
			if(num%i == 0 ){
				System.out.println(i%2);
				count++;
			}
		}
		if(count == 0)
			System.out.println(count +"Prime");
		else 
			System.out.println(count +"No is not prime");
	}
}

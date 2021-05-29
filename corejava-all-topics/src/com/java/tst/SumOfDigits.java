package com.java.tst;

public class SumOfDigits {
	public static void main(String[] args) {
//		int a = 2013;
		int sum =0;//b,d=0;
		for (int i = 201; i < 301; i++) {
//			b = i%10;
//			i = i/10;
			sum = sum + i;
//			d = d * 10 + b;
		}
		System.out.println(sum);
	}
}

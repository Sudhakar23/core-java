package com.test;

//Getting next heighest
public class CoreTest {
	public static void main(String[] args) {

		Integer arr[] = { 2, 3, 6, 7, 1, 3, 3, 2, 3, 4, 10, 6, 2, 10, 2, 3 };
		int a = 0, b = 0;

		for (Integer letterCount : arr) {
			if (letterCount > a) {
				b = a;
				a = letterCount;
			}
			if (letterCount < a && letterCount > b) {
				b = letterCount;
			}
		}
		System.out.println("A - " + a);
		System.out.println("B - " + b);
	}
}

package com.java.lara.polymorphism;

public class Prog40 {
	static void test(Float f1) {
		System.out.println("float");
	}

	static void test(double d1) {
		System.out.println("double");
	}

	public static void main(String[] args) {
		long lon = 10;
		double d=11.1;
		test(lon);
		test(d);
	}
}

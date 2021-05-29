package com.lara_1;

class A {
	static int m1() {
		System.out.println("m1");
		return 1 / 0;
	}
}

public class Manager2 {
	public static void main(String[] args) {
		System.out.println("main begin");
		A.m1();
		System.out.println("main end");
	}
}

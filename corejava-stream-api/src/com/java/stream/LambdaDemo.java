package com.java.stream;

public class LambdaDemo implements I1 {
	@Override
	public void m1() {
		System.out.println("m1 from lambdaDemo...");
	}
	public static void main(String[] args) {
		LambdaDemo lambdaDemo = new LambdaDemo();
		lambdaDemo.m1();
	}
}

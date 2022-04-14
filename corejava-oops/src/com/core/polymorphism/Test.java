package com.core.polymorphism;
class A {
	
	
	public void m1(Integer i) {
	
		System.out.println("A class");
	}
}
class B extends A{
	
	public void m1(Integer i) {
		System.out.println("Wrapper class");
	}
	public void m1(int i) {
		System.out.println("Pre class");
	}
}

public class Test {
	public static void main(String[] args) {
//		B b = new B(1);
		B a = new B();
		a.m1(Integer.valueOf(1));
		
		
	}
}

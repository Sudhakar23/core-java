package com.java.tst;
class A {
	static{
		System.out.println("A");
		new B();
		System.out.println("A_");
	}
	public A() {
		System.out.println("A constructor");
	}
}
class B{	
	static{
		System.out.println("B");
		new A();
		System.out.println("B_");
	}
	public B() {
		System.out.println("B constructor");
	}
}
public class TestOctal{
	public static void main(String[] args) {
		new A();
	}
}
package com.core.polymorphism;
class A {
	A(){
		System.out.println("A constructor");
	}
}
class B extends A{
	B(int a ){
		System.out.println(a);
	}
}

public class Test {
	public static void main(String[] args) {
		B b = new B(1);
		
	}
}

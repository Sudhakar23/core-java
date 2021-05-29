package com.java.lara.polymorphism;
class PAA{
	void m1(int a){
		System.out.println("m1 in A");
	}
}

public class B extends PAA{
void m1(int a){
	System.out.println("m1 in B");
}
public static void main(String[] args) {
	PAA a1=new B();
	a1.m1(10);
}
}

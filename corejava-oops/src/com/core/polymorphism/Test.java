package com.core.polymorphism;
class Parent1 {
	
	
	public void m1(Integer i) {
	
		System.out.println("A class");
	}
	
	public String display(String i) {
		System.out.println("Integer class");
		return "";
	}
}
class Child1 extends Parent1{
	
	public void m1(Integer i) {
		System.out.println("Wrapper class");
	}
	public void m1(int i) {
		System.out.println("Pre class");
	}
	
	@Override
	public void display(String i) {
		System.out.println("String  class");
//		return "";
	}
}

public class Test {
	public static void main(String[] args) {
//		B b = new B(1);
		Parent1 child = new Child1();
		child.m1(1);
		
//		child.display(1);
		child.display("str");
	
	}
}

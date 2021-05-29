package com.java.myprog;
class B extends A{
	 int j=30;
}
class A{
	
	 int a=10;
	static void m1(){
		//a=20;
		A j=new A();
		System.out.println(j.a);
		
	}
	void m2(){
		//a=30;
		System.out.println(a);
		
	}
}
public class MyClass2 {
	public static void main(String[] args) {
		final A i=new A();
		//i=new B();
		i.m1();
		i.m2();
		
	}
}

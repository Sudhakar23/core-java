package com.java.jlc.p11;

public class C extends A {
	A a1 = new A();
	public void m3(){
		System.out.println("M3 in C");
		System.out.println(a1.b +" " +a1.c +" " +a1.d);
		System.out.println(b +" " +c +" " +d);
		System.out.println("M3 Ends");
	}	
}

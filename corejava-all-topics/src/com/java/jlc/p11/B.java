package com.java.jlc.p11;

public class B {
	A a1 = new A();
	public void m2(){
		System.out.println("M2 in A");
		//System.out.println(a1.a);
		System.out.println(+a1.b +" " +a1.c +" " +a1.d);
		System.out.println("M2 ends");
	}
}

package com.core.io.dande;
class M1{
	public void m1() {
		System.out.println("M1()");
	}	
}

class B1 extends M1{
	public void m1() {
		System.out.println("B1()");
	}
}

public class RuntimePoly {

	public static void main(String[] args) throws Exception {

		M1 m11 = new B1();
		m11.m1();
		System.out.println("Done");

	}
}
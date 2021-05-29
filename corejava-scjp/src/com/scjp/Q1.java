package com.scjp;

abstract interface Frob {
	public void m1(String str);
}

class Top{
	public Top(String str) {
		System.out.println("B");
	}
}
class Bottom2 extends Top{
	public Bottom2(String s) {
		super("asd");
		System.out.println("D");
		System.out.println( s);
	}
	
}
public abstract class Q1 implements Frob {
	public static void main(String[] args) {
		new Bottom2("C");
		System.out.println(" C");
	}
}

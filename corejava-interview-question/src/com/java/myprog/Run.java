package com.java.myprog;

class S1 {
	int i = 18;

	void m1() {
		S1 s = new S2();
		System.out.println("from s1  " + s.i);
	}
}

class S2 extends S1 {
	int i = 23;

	void m1() {
		S1 s = new S2();

		System.out.println("from s2  " + s.i + " " + s);
		

	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "testString";
	}
}

public class Run {
	public static void main(String[] args) {
		S1 s = new S2();
		s.m1();
	}
}

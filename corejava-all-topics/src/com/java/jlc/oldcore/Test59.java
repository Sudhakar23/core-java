package com.java.jlc.oldcore;

class Hello59 {
	void m1() {
		System.out.println("m1 in Hello");
	}

	void m2() {
		System.out.println("m2 in Hello");
	}

	int m3() {
		System.out.println("m3 in Hello");
		return 10;
	}
}

class Hai59 extends Hello59 {

	void m2() {
		System.out.println("m2 in Hai");
		super.m2();
	}

	int m3() {
		System.out.println("m3 in Hai");
		return 10;
	}
}

class Test59 {
	public static void main(String arg[]) {
		Hai59 hai = new Hai59();
		hai.m1();
		hai.m2();

	}
}
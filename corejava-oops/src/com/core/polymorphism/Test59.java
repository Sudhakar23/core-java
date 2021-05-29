package com.core.polymorphism;

class Hello1 {
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

class Hai1 extends Hello1 {

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
		Hai1 hai = new Hai1();
		hai.m1();
		hai.m2();

	}
}
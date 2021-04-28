package com.lara.thread.dead;

public class MethodTest {
	void method1() {
		System.out.println("method1");
	}
	int method2() {
		System.out.println("method2");
		System.out.println();
		return 1;
	}
	void method3(int a) {
		System.out.println("method1" + a);
	}
	double method4(int a, float b) {
		System.out.println("method1");
		return a + b;
	}
	public static void main(String[] args) {
		System.out.println("main method");
		MethodTest m = new MethodTest();
		m.method1();
		
		int g1=m.method2();
		
		m.method3(8);
		
		 double g=m.method4(3, 3.4f);
	}
}

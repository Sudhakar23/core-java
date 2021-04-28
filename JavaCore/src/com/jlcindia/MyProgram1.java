package com.jlcindia;

class T4 extends Thread {
	@Override
	public void run() {
		T5 t5 = new T5();
		T6 t6 = new T6();
		t5.m1();
		t6.m2();
	}
}

class T5 {
	synchronized void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}

class T6 {
	synchronized void m2() {
		for (int i = 10; i < 20; i++) {
			System.out.println(i);
		}
	}
}

public class MyProgram1 {
	public static void main(String[] args) {
		T4 t4 = new T4();
		t4.start();
	}
}

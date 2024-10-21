package com.jlcindia;

class T1 extends Thread {
	static T3 t3 = new T3();

	@Override
	public void run() {
		t3.m1();
		t3.m2();
		System.out.println(t3.hashCode());

	}
}

class T2 extends Thread {
	@Override
	public void run() {

		T1 t1 = new T1();
		System.out.println(t1.t3.hashCode());
		t1.t3.m1();
		t1.t3.m2();

	}
}

class T3 {
	synchronized void m1() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

	}

	synchronized void m2() {
		for (int i = 10; i < 20; i++) {
			System.out.println(i);
		}

	}
}

public class MyProgramThread {
	public static void main(String[] args) {
		T1 t1 = new T1();
		t1.start();
		T2 t2 = new T2();
		t2.start();
	}
}

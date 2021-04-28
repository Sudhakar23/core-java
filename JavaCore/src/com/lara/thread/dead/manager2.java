package com.lara.thread.dead;

class Shared {
	void test() {
		for (int i = 0; i < 100; i++) {
			System.out.println("First for loop : " +i);
		}
		
		synchronized (this) {
			for (int i = 100; i < 200; i++) {
				System.out.println("from sync ctx   " + i);
			}
		}
		
		for (int i = 200; i < 300; i++) {
			System.out.println("Second for loop : " +i);
		}
	}
}

class A extends Thread {
	Shared s1;

	A(Shared s1) {
		this.s1 = s1;
	}

	public void run() {
		s1.test();
	}
}

class B2 extends Thread {
	Shared s1;

	B2(Shared s1) {
		this.s1 = s1;
	}

	public void run() {
		s1.test();
	}
}

public class manager2 {
	public static void main(String[] args) {
		Shared s1 = new Shared();
		A a = new A(s1);
		B2 b2 = new B2(s1);
		a.start();
		b2.start();
	}
}

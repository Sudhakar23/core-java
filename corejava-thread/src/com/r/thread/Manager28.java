package com.r.thread;

class AA {
	synchronized void test1() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}

	synchronized void test2() {
		System.out.println("+++++");
		for (int i = 100; i < 200; i++) {
			System.out.println(i);
		}
	}
}

class BB extends Thread {
	AA a1;

	BB(AA a1) {
		this.a1 = a1;
	}

	public void run() {
		a1.test1();
	}
}

class CC extends Thread {
	AA a1;

	CC(AA a1) {
		this.a1 = a1;
	}

	public void run() {
		a1.test2();
	}
}

public class Manager28 {
	public static void main(String[] args) {
		AA a1 = new AA();
		BB b1 = new BB(a1);
		CC c1 = new CC(a1);
		b1.start();
		c1.start();
		// System.out.println("-----");
	}
}

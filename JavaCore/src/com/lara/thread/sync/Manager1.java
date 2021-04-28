package com.lara.thread.sync;

class A {
	synchronized void Test() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}

class B extends Thread {
	A obj;

	B(A obj) {

		this.obj = obj;

	}

	public void run() {
		System.out.println(obj.hashCode());
		obj.Test();
	}
}

class C extends Thread {
	A obj;

	C(A obj) {
		this.obj = obj;
	}

	public void run() {
		System.out.println("C" + obj.hashCode());
		obj.Test();
	}
}

public class Manager1 {
	public static void main(String[] args) {
		A obj = new A();
		B b1 = new B(obj);
		C c1 = new C(obj);
		b1.start();
		c1.start();
	}
}

package com.scjp.thread;

class B {
	synchronized void abc() throws Exception {
		wait(2000);
	}
}

class A extends Thread {
	@Override
	public void run() {
		B b = new B();
		try {
			b.abc();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Q6 {
	public static void main(String[] args) {
		A a = new A();
		a.start();
	}
}

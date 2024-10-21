package com.java.thread.lara.thread.dead;

class Test {
	synchronized void test1() {
		System.out.println("test1");
		try {
			wait();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("test1 end");
	}

	synchronized void test2() {
		notify();
	}
}

class Thread1 extends Thread {
	Test t1;

	Thread1(Test t) {
		t1 = t;
	}

	public void run() {
		t1.test1();
	}
}

public class Manager3 {
	public static void main(String[] args) {
		Test t = new Test();
		Thread1 t1 = new Thread1(t);
		t1.start();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(e);
		}
		t.test2();
	}
}

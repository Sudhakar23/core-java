package com.java.thread.jlc.thread1;

class Hello {
	synchronized void m1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("m1 in Hello :"
					+ Thread.currentThread().getName() + "   " + i);
			try {
				// Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	synchronized void m2() {
		for (int i = 10; i < 15; i++) {

			System.out.println("m2 in Hello :"
					+ Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class HelloThread1 implements Runnable {
	String str;
	Hello h1;

	public HelloThread1() {
	}

	HelloThread1(String str, Hello h1) {
		this.str = str;
		this.h1 = h1;
		try {
			h1.wait(111);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		h1.notify();
		Thread t1 = new Thread(this, str);
		t1.start();
	}

	public void run() {
		h1.m2();
	}
}

class HaiThread implements Runnable {
	String str;
	Hello h1;

	public HaiThread() {
	}

	HaiThread(String str, Hello h1) {
		this.str = str;
		this.h1 = h1;
		Thread t1 = new Thread(this, str);
		t1.start();
	}

	public void run() {
		h1.m1();
	}
}

public class Test6 {
	public static void main(String[] args) {
		Hello h1 = new Hello();
		Hello h2 = new Hello();
		new HelloThread1("A", h1);
		new HaiThread("B", h2);
	}
}

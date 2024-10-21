package com.lara.thread.exercise2;

public class Manager13 {
	public static void main(String[] args) {
		class A extends Thread {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(i);
				}
			}
		}
		class B implements Runnable {
			public void run() {
				for (int i = 1000; i < 2000; i++) {
					System.out.println(i);
				}
			}
		}
		A a = new A();
		a.start();
		B b = new B();
		Thread th = new Thread(b);
		th.start();
		for (int i = 2000; i < 3000; i++) {
			System.out.println(i);
		}
	}
}

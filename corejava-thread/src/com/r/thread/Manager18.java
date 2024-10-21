package com.r.thread;

class B implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}

public class Manager18 {
	public static void main(String[] args) {
		B b = new B();
		Thread th = new Thread();
		th.start();
		// th.run();
		for (int i = 10; i < 20; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				System.out.println(ex);
				ex.printStackTrace();
			}
		}
	}
}

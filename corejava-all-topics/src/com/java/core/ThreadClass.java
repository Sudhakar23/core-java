package com.java.core;

class ThreadTest extends Thread {

	int i;

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {

			if (i % 2 == 0) {
				try {
					System.out.println(Thread.currentThread().getName() + i);
					wait();
				}

				catch (Exception e) {
				}
				if (i % 2 != 0) {
					Ravi r1 = new Ravi();
					r1.setName("-- RAVI --");
					r1.start();
					System.out.println(Thread.currentThread().getName() + i + "====");
				}
			}
		}
	}

	class Ravi extends Thread {
		@Override
		public void run() {
		}

	}
}

public class ThreadClass {
	public static void main(String[] args) {
		ThreadTest threadTest = new ThreadTest();
		threadTest.setName("Thread Test");
		threadTest.start();
		// r.notify();

	}

}

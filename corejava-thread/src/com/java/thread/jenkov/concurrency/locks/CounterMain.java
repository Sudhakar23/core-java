package com.java.thread.jenkov.concurrency.locks;

public class CounterMain {

	public static void main(String[] args) {
		CounterSynchronized counterObj = new CounterSynchronized();

		Runnable runnable1 = () -> {
			for (int i = 0; i < 100000; i++) {
				counterObj.inc();
			}
			System.out.println("Thread " +counterObj.getCount());

		};

		Runnable runnable2 = () -> {
			for (int i = 0; i < 100000; i++) {
				counterObj.inc();
			}
			System.out.println("Thread " +counterObj.getCount());

		};

		Thread th1 = new Thread(runnable1);
		Thread th2 = new Thread(runnable2);
		th1.start();
		th2.start();

	}

}

class MyThread implements Runnable {

	@Override
	public void run() {

		System.out.println("Thread started");

	}

}

class MyThread2 implements Runnable {

	@Override
	public void run() {

		System.out.println("Thread started");

	}

}
package com.java.thread.jenkov;

import java.util.concurrent.atomic.AtomicInteger;

public class RaceConditionsExample {

	public static void main(String[] args) {
		Counter count = new Counter();
		
		Thread thread1 = new Thread(getRunnable(count, "Thread 1 "));
		Thread thread2 = new Thread(getRunnable(count, "Thread 2 "));
		thread1.start();
		thread2.start();

	}
	
	private static Runnable getRunnable(Counter counter, String message) {
		AtomicInteger as ;
		return () -> {
			for (int i = 0; i < 1000; i++) {
				synchronized(counter) {
					counter.incCounter();
//					System.out.println(message + " Loop counter " +i);
				}
			}
			System.out.println(message + counter.get());
		};
	}
}

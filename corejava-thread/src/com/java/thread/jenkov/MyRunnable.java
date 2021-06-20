package com.java.thread.jenkov;


/**
 * @author SUDHAKAR
 * variable i be part of method so resides in Thread stack, every thread will be having own i variable
 * variable count is part of object so it will resides in Heap area, and it will be shared 
 * between threads.
 */
public class MyRunnable implements Runnable {
	
	private int count = 0;

	@Override
	public void run() {
		count = 0;
		MyObject mojj = new MyObject();
		System.out.println(mojj);

		for (int i = 0; i < 1_000; i++) {
			synchronized (this) {
				count++;
			}
		}
		System.out.println(Thread.currentThread().getName() +" : " +  count);

	}
}
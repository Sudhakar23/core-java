package com.java.thread.jenkov.concurrency.deadlock;

public class RunnableSync1 implements Runnable {
	
	private Object lock1;
	private Object lock2;
	
	public RunnableSync1(Object lock1, Object lock2) {
		this.lock1 = lock1;
		this.lock2 = lock2;
	}
	
	public void run() {
		
		System.out.println("Attempt to lock lock1.");
		synchronized(lock1) {
			System.out.println("Lock1 locked");
			
			System.out.println("Attempt to lock lock2.");
			synchronized (lock2) {
				System.out.println("Lock2 locked");
			}
			
		}
		
	}
	

}

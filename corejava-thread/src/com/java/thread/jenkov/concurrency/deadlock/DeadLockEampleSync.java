package com.java.thread.jenkov.concurrency.deadlock;

public class DeadLockEampleSync {
	
	public static void main(String[] args) {
	
		Object lock1 = new Object();
		Object lock2 = new Object();
		
		RunnableSync1 runnable1 = new RunnableSync1(lock1, lock2);
		RunnableSync2 runnable2 = new RunnableSync2(lock1, lock2);
		
		Thread th1 = new Thread(runnable1);
		Thread th2 = new Thread(runnable2);
		
		th1.start();
		th2.start();
	}
}

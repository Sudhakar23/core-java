package com.java.thread.jenkov.concurrency.deadlock;

import java.util.concurrent.locks.Lock;

public class Runnable2 implements Runnable {

	private Lock lock1 = null;
	private Lock lock2 = null;
	
	public Runnable2(Lock lock1, Lock lock2) {
		this.lock1 = lock1;
		this.lock2 = lock2;
	}
	
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName +" attempls lock lock2");
		lock2.lock();
		System.out.println(threadName +" locked lock2");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(threadName +" attempled lock lock1");
		lock1.lock();
		System.out.println(threadName +" locked lock1");

		
		System.out.println(threadName +" Unlocking lock1");
		lock1.unlock();
		System.out.println(threadName +" Unlocking lock2");
		lock2.unlock();
		
	}
}

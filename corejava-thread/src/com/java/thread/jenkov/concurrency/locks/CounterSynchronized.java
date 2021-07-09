package com.java.thread.jenkov.concurrency.locks;

public class CounterSynchronized {
	
	private long counter = 0;
	
	public synchronized void inc() {
		counter++;
	}
	
	public synchronized long getCount() {
		return counter;
	}
}

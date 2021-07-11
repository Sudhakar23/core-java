package com.java.thread.jenkov.concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterLock {

	private long counter = 0;

	Lock lock = new ReentrantLock();

	public void inc() {
		try {
			lock.lock();
			this.counter++;
		} finally {
			lock.unlock();
		}
	}

	public long getCount() {
		try {
			lock.unlock();
			return counter;
		} finally {
			lock.unlock();
		}
	}
}

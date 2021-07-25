package com.java.thread.jenkov.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue<String> bq = null;

	public Consumer(BlockingQueue<String> bq) {
		this.bq = bq;
	}

	@Override
	public void run() {
		while (true) {
			try {
				String element = this.bq.take();
				System.out.println("Consumed " + element);
			} catch (InterruptedException e) {
				System.out.println("Consumer was interrupted");
			}
		}

	}
}

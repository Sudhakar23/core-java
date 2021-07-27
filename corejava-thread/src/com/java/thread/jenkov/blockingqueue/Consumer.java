package com.java.thread.jenkov.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue<String> blockingQueue = null;

	public Consumer(BlockingQueue<String> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				String element = this.blockingQueue.take();
				System.out.println(Thread.currentThread().getName()  +" Consumed " + element);
			} catch (InterruptedException e) {
				System.out.println("Consumer was interrupted");
			}
		}

	}
}

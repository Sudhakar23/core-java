package com.java.thread.jenkov.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	BlockingQueue<String> blockingQueue = null;

	public Producer(BlockingQueue<String> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	public void run() {

		while (true) {
			long timeMills = System.currentTimeMillis();
			
			try {
				this.blockingQueue.put("Element " + timeMills);
				System.out.println(Thread.currentThread().getName() +" Produced " +timeMills );
				
			} catch (InterruptedException e) {
				System.out.println("Producer was interrupted");
			}
			sleep(1000);
		}
	}
	
	private void sleep(long timeMills) {
		try {
			Thread.sleep(timeMills);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

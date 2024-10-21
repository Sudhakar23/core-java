package com.java.thread.jenkov.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueUsageExample {

	public static void main(String[] args) throws InterruptedException {

		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue(3);
		blockingQueue.put("Element 1"); // enqueue
		blockingQueue.put("Element 2"); // enqueue
		blockingQueue.put("Element 3"); // enqueue
		System.out.println(blockingQueue.take()); // dequeue
		System.out.println(blockingQueue);
		System.out.println(blockingQueue.take()); // dequeue
		System.out.println(blockingQueue);
		
		
	}

}

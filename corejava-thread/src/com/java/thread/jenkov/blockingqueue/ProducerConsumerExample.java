package com.java.thread.jenkov.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerExample {

	public static void main(String[] args) {
		
		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue(3);
		Producer producer = new Producer(blockingQueue);
		Consumer consumer = new Consumer(blockingQueue);
		
		new Thread(producer).start();
		new Thread(consumer).start();
	}

}

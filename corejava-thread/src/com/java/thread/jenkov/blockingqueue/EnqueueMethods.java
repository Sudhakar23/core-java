package com.java.thread.jenkov.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class EnqueueMethods {
	public static void main(String[] args) {
		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue(3);
		
		// put() will block until there is space
		// inside the BlockQueue for the element
		try {
			blockingQueue.put("1");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		// add will throw IllegalStateException if 
		// no spce abailable in BlockingQueue
		try {
			blockingQueue.add("2");
		}catch(IllegalStateException e) {
			e.printStackTrace();
		}
		
		// offer() returns fase if no space
		boolean wasEnqueud = blockingQueue.offer("3");
		
		// Offer(o, time, TimeUnit) blocks for time if no space, 
		// then returns false if still no space.
		try {
			boolean wasEnqueud1 = blockingQueue.offer("4", 1000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(blockingQueue);
		
	}
}

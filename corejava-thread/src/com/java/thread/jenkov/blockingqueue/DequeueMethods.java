package com.java.thread.jenkov.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class DequeueMethods {

	public static void main(String[] args) {
		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue(3);
		
		
		// take() blocks until an element becomes available
		try {
			String take = blockingQueue.take();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// poll() return null if no element is available
		String poll = blockingQueue.poll();
		
		// poll(long timeout, TimeUnit timeUnit) blocks up until timeout 
		// for an element to become available. If no element is available 
		// before that time, null is returned.
		try {
			blockingQueue.poll(1000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// removes the element if present 
		boolean waseRemoved = blockingQueue.remove("1");
		
		
	}

}

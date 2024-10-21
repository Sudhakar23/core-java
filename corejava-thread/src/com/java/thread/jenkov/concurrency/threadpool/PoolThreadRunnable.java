package com.java.thread.jenkov.concurrency.threadpool;

import java.util.concurrent.BlockingQueue;

public class PoolThreadRunnable implements Runnable {
	
	private Thread 			thread 		= null;
	private BlockingQueue 	taskQueue	= null;
	private boolean 		isStopped 	= false;
	
	public PoolThreadRunnable(BlockingQueue blockingQueue){
		this.taskQueue = blockingQueue;
	}
	
	public void run() {
		this.thread = Thread.currentThread();
		while(!isStopped) {
			
			try {
				Runnable runnable = (Runnable) taskQueue.take();
				runnable.run();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}	
	}
	
	public synchronized void doStop() {
		isStopped = true;
		//break pool thread out of dequeue() call. 
		this.thread.interrupt();
	}
	
	public synchronized boolean isStopped() {
		return isStopped;
	}
}

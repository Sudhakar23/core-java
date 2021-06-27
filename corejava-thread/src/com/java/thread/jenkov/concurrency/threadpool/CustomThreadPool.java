package com.java.thread.jenkov.concurrency.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CustomThreadPool {
	
	private BlockingQueue<Runnable> taskQueue = null;
	private List<PoolThreadRunnable> runnables = new ArrayList();
	private boolean isStopped = false;
	
	public CustomThreadPool(int noOfthreads, int maxNoOfTasks) {
		taskQueue = new ArrayBlockingQueue(maxNoOfTasks);
		for(int i = 0; i<noOfthreads; i++) {
			PoolThreadRunnable poolThreadRunnable = new PoolThreadRunnable(taskQueue);
			runnables.add(poolThreadRunnable);
		}
		
		for (PoolThreadRunnable runnable : runnables) {
			new Thread(runnable).start();  
		}
	}

	public synchronized void execute(Runnable task) throws Exception{
		if(this.isStopped) 
			throw new IllegalStateException("Thread Pool is stopped.");
		this.taskQueue.offer(task);
	}
	
	public synchronized void stop() {
		this.isStopped = true;
		for(PoolThreadRunnable runnable: runnables) {
			runnable.doStop();
		}
	}
	
	public synchronized void watiUntilAllTaskFinished() {
		while(this.runnables.size() > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

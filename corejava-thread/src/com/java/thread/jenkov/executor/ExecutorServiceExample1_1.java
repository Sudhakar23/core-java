package com.java.thread.jenkov.executor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample1_1 {

	public static void main(String[] args) {
		
		int  corePoolSize 	 = 10;
		int  maximumPoolSize = 20;
		long keepAliveTime   = 3000;
		
		ExecutorService threadPoolExecutor = new ThreadPoolExecutor(
				corePoolSize, maximumPoolSize, keepAliveTime, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(128));
		int coreSize = Runtime.getRuntime().availableProcessors();
		threadPoolExecutor = Executors.newFixedThreadPool(coreSize);
		
		ExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(corePoolSize);
		scheduledExecutorService = Executors.newScheduledThreadPool(corePoolSize);
		
		
		
		
		
		
	}

}

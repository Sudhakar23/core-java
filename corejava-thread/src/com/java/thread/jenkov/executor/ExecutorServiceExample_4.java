package com.java.thread.jenkov.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample_4 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		Future future = executor.submit(newCallable("Thread 3"));
		System.out.println("Call return "+(String)future.get());
		
		
		executor.shutdown();
		
	}
	
	
	private static Callable<Object> newCallable(String msg) {
		
		return new Callable<Object>() {
			
			public String call() {
				String returnMsg = Thread.currentThread().getName() + msg;
				return returnMsg;
			}
		};
		
	}
}

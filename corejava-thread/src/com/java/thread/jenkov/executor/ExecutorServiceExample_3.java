package com.java.thread.jenkov.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample_3 {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		Future future = executor.submit(newRunnable("Thread 2"));
		
		try {
			System.out.println(future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executor.shutdown();
		
		System.out.println(future.isDone());
		
	}
	
	private static Runnable newRunnable(String msg)  {
		return new Runnable() {
			public void run() {
				String completeMsg = Thread.currentThread().getName() + " : " +msg;
				System.out.println(completeMsg);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
	}
}

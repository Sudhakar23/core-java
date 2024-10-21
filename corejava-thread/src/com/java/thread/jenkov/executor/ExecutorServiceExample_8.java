package com.java.thread.jenkov.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample_8 {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		Future future = executorService.submit(myCallable("Task 1"));
 
		System.out.println(future.isDone());
		
		boolean mayInterruptIfRunning = false;	
		boolean cancelStatus = future.cancel(mayInterruptIfRunning);
		
		System.out.println(future.isDone());
		
		try {
			System.out.println(future.get());
		} catch (InterruptedException e) {
		} catch (ExecutionException e) {
		} catch (CancellationException e) {
			System.out.println("Can not call Future.get() since task was cancelled");
		}
		System.out.println(future.isDone());
		executorService.shutdown();
	}
	
	public static Callable<String> myCallable(String msg) {
		return new Callable() {
			public String call() {
				return Thread.currentThread().getName() + msg;
			}
		};
		
	}
	

}

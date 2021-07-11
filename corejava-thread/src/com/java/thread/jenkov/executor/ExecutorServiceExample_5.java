package com.java.thread.jenkov.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample_5 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService  executorService = Executors.newFixedThreadPool(4);
		
		List<Callable> callables = new ArrayList();
		callables.add(newCallable("Task 1") );
		callables.add(newCallable("Task 2") );
		callables.add(newCallable("Task 3") );
		
		Future future = executorService.submit(newCallable("thread"));
		System.out.println(future.get());
		
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

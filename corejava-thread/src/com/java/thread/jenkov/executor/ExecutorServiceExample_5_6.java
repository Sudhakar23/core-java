package com.java.thread.jenkov.executor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample_5_6 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService  executorService = Executors.newFixedThreadPool(4);
		
		List<Callable<String>> callables = new ArrayList();
		callables.add(newCallable("Task 1") );
		callables.add(newCallable("Task 2") );
		callables.add(newCallable("Task 3") );
		
		//invokeAny
//		String result = (String)executorService.invokeAny((Collection)callables);
//		System.out.println(result);
		
		//invokeAll
		List<Future<String>> result = executorService.invokeAll((Collection<Callable<String>>)callables);
		for (Future future : result) {
			System.out.println(future.get());
		}
		
		
		executorService.shutdown();
		
	}

	private static Callable<String> newCallable(String msg) {

		return new Callable<String>() {

			public String call() {
				String returnMsg = Thread.currentThread().getName() + msg;
				return returnMsg;
			}
		};

	}

}

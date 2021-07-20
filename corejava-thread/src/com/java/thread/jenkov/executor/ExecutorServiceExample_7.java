package com.java.thread.jenkov.executor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample_7 {

	public static void main(String[] args)  {
		ExecutorService  executorService = Executors.newFixedThreadPool(4);
		
		Future<String> future = executorService.submit(newCallable("Task"));
		
		executorService.shutdown();
		List<Runnable> runnable = executorService.shutdownNow();
		System.out.println(runnable);
		
		try {
			executorService.awaitTermination(3000L, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
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

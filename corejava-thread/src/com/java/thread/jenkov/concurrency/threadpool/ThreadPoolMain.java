package com.java.thread.jenkov.concurrency.threadpool;

public class ThreadPoolMain {
	public static void main(String[] args) {
		CustomThreadPool threadPool = new CustomThreadPool(3,10); // 3 threads, 10 tasks
		
		for (int i = 0; i < 10; i++) {
			int taskNo = i;
			threadPool.execute(()->{
				String message = Thread.currentThread().getName() +": Task" + taskNo;
				System.out.println(message);
			});
		}
	}
}

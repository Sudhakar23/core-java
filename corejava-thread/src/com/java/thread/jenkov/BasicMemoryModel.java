package com.java.thread.jenkov;

public class BasicMemoryModel {

	public static void main(String[] args) {

		Runnable runnable1 = new MyRunnable();
		Runnable runnable2 = new MyRunnable();
		
		Thread th1 = new Thread(runnable1, "Thread1");
		Thread th2 = new Thread(runnable1, "Thread2");
		
		th1.start();
		th2.start();
	}

}

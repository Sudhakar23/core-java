package com.java.thread;

public class ThreadExample {

	public static void main(String[] args) {
		
		System.out.println("Cores " +Runtime.getRuntime().availableProcessors());
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(task());
			thread.start();
		}
	}
	
	public static Runnable task() {
		
		return new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
	}
}
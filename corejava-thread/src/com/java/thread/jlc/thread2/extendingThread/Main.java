package com.java.thread.jlc.thread2.extendingThread;

public class Main {
	public static void main(String[] args) {
		int iterations = 3;
		
		MyThread thread = new MyThread();
		thread.start();// start will call run method
		
		MyRunnable runnable = new MyRunnable();
		new Thread(runnable).start();
		
		try {
			for (int i = 0; i < iterations; i++) {
				System.out.println("From main process");
				Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}
	}
}

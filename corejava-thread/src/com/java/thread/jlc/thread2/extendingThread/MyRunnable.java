package com.java.thread.jlc.thread2.extendingThread;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		int iteration = 5;
		try {
			for (int i = 0; i < iteration; i++) {
				System.out.println("From Runnable...");
				Thread.sleep(1500);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}
	}
}
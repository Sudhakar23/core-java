package com.jlc.thread2.extendingThread;

public class MyThread extends Thread{
	@Override
	public void run() {
		int iteration = 5;
		try {
			for (int i = 0; i < iteration; i++) {
				System.out.println("From secondary thread");
				sleep(2000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}
	}
}
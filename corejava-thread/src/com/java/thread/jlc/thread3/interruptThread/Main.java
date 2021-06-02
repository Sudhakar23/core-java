package com.java.thread.jlc.thread3.interruptThread;

public class Main {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		
		try {
			thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		thread.interrupt();
		System.out.println("Called interrupt...");
	}
}

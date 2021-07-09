package com.java.thread.jenkov.concurrency.locks;

public class CounterMain {
	
	public static void main(String[] args) {
		MyThread th1 = new MyThread();
		new Thread(th1).start();
		
	}
	
	
}

class MyThread implements Runnable{

	@Override
	public void run() {

		System.out.println("Thread started");
		
	}
	
}
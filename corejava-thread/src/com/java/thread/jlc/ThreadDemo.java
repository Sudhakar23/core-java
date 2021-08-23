package com.java.thread.jlc;

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread();
		t1.setName("CHILD");
		t1.start();
			t1.join();
		for(int i = 0; i < 50; i++) {
			System.out.println("MAIN THREAD");
			//Thread.yield();
		}
	}
}
class MyThread extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println("Child thread");
//			try {
//				Thread.sleep(0);
//			} catch (InterruptedException e) {
//			}
		}
	}
}
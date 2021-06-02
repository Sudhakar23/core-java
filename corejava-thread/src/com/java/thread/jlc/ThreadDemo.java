package com.java.thread.jlc;

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("CHILD");
		t1.start();
		try{
			t1.join(5000);
		}catch(InterruptedException e){}
		for(int i = 0; i < 10; i++) {
			System.out.println("MAIN THREAD");
			//Thread.yield();
		}
	}
}
class MyThread extends Thread {
	@Override
	public void start(){
		super.start();
	}
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
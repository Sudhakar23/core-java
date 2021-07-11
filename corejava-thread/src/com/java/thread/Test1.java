package com.java.thread;

class MyThread implements Runnable{
	@Override
	public void run() {	
		for (int i = 0; i <100; i++) {
			System.out.println(i);
		}
	}
}
public class Test1 {

	public static void main(String[] args) {
		MyThread th=new MyThread();
		Thread t=new Thread(th);
		
		t.start();
		for (int i = 100; i <200; i++) {
			System.out.println(i);
		} 
	}

}

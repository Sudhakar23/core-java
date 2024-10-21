package com.durga.thread.deadlock;

public class MyThread extends Thread {
	
	A a = new A();
	B b = new B();

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.m1();
	}
	public void run(){
		a.work(b);
	}
	public void m1(){
		this.start();
		b.work(a);
	}

}

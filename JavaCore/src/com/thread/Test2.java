package com.thread;

class MyThread1 extends Thread{
	@Override
	public void run() {	
		for (int i = 0; i <100; i++) {
			System.out.println(i);
		}
	}
}
public class Test2 {

	public static void main(String[] args) {
		MyThread1 th=new MyThread1();
		th.start();
		for (int i = 100; i <200; i++) {
			System.out.println(i);
		}
	}

}

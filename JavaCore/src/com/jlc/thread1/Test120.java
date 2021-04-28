package com.jlc.thread1;

class HelloTh implements Runnable{
	public void run() {
	}
}
class HelloTh1 implements Runnable{
	public HelloTh1(){
		Thread t1 = new Thread(new HelloTh1());
		t1.start();
	}
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getThreadGroup().getName());
		}
	}
}

public class Test120 {

	public static void main(String[] args) {
		HelloTh ht = new HelloTh();	

	}

}

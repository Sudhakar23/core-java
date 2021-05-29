package com.java.scjpdump;

class Th1 extends Thread {
	//private static final String notify = null;

	public void run() {
		for (int i = 0; i < 1000; i++) {
			
			try {
				 sleep(100);
				if (i % 2 != 0) {
					System.out.println(Thread.currentThread().getName()+ i);
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Th2 extends Thread {
	public void run() {
		
		for (int i = 0; i < 1000; i++) {
			try {
				 sleep(100);
				if (i % 2 != 0) {
					System.out.println( Thread.currentThread().getName()+i);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class MainClass {
	public static void main(String[] args) {
		Th1 th1 = new Th1();
		th1.setName("Thread1");
		th1.start();
		Th2 th2=new Th2();
		th2.setName("Thread2");
		th2.start();
	}
}
package com.core.lambda.durga;

public class ThreadDemo_10 {
	public static void main(String[] args) {
//		Runnable r = ()->{
//			for (int i = 0; i < 2; i++) {
//				System.out.println("Child Thread " + i);
//			}
//		};
//		Thread th = new Thread(r);
//		th.start();
//		for (int i = 0; i < 2; i++) {
//			System.out.println("main Thread " +i);
//		}
		ThreadTest tt = new ThreadTest();
		Thread t = new Thread(tt);
		t.start();
		
		//With Lambda expression
		Runnable run = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("i " +i);
			}
		};
		
		Thread ttt = new Thread(run);
		ttt.start();
	}
}

class ThreadTest extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i " +i);
		}
	}
}

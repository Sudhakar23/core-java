package com.java.lambda;

public class ThreadDemo_10 {
	public static void main(String[] args) {
		
		//Without Lambda expression
		Runnable runWithoutLambda = new Runnable(){
			public void run() {
				for (int i = 0; i < 2; i++) {
					System.out.println("Child Thread " + i);
				}
			}
		};
		new Thread(runWithoutLambda).start();;
		
		for (int i = 0; i < 2; i++) {
			System.out.println("main Thread " +i);
		}
		
		ThreadTest tt = new ThreadTest();
		Thread t = new Thread(tt);
		t.start();
		
		//With Lambda expression
		Runnable run = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("i " +i);
			}
		};
		
		new Thread(run).start();
		
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
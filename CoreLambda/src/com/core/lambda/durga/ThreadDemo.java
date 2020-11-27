package com.core.lambda.durga;

public class ThreadDemo {
	public static void main(String[] args) {
		Runnable r = ()->{
			for (int i = 0; i < 2; i++) {
				System.out.println("Child Thread " + i);
			}
		};
		Thread th = new Thread(r);
		th.start();
		for (int i = 0; i < 2; i++) {
			System.out.println("main Thread " +i);
		}
	}
}

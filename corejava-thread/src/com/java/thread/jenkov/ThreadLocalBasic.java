package com.java.thread.jenkov;

public class ThreadLocalBasic {

	public static void main(String[] args) {
		ThreadLocal<String> threadLocal1 = new ThreadLocal();
		Thread th1 = new Thread( () -> {
			threadLocal1.set("Thread 1");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			String value = threadLocal1.get();
			System.out.println(value);
		});

		Thread th2 = new Thread( () -> {
			threadLocal1.set("Thread 2");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			String value = threadLocal1.get();
			System.out.println(value);
		});
		
		th1.start();
		th2.start();
		

	}

}

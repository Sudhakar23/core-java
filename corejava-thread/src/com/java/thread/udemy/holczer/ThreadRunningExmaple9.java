package com.java.thread.udemy.holczer;

public class ThreadRunningExmaple9 {

	
	public static void sleep (long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Runnable runnable = () -> {
			while(true) {
				sleep(1000);
				System.out.println("running");
			}
		};
		
		Thread th = new Thread(runnable);
		th.setDaemon(true);
		th.start();
		
//		try {
//			th.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		System.out.println("Main Thread ends.");
//		th.setDaemon(true);
	}

}

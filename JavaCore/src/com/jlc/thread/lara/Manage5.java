package com.jlc.thread.lara;

class B extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		
	} 
}
}
public class Manage5 {

	public static void main(String[] args) {
		B b1 = new B();
		Thread th1 = new Thread(b1);
	
		 
		 th1.start();
		 /*try {
			th1.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}*/
		for (int i = 10; i < 20; i++) {
			System.out.println("From main : " + i);
		}
		System.out.println("end");
	}
}


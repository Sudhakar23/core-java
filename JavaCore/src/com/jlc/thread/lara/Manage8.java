package com.jlc.thread.lara;

class F extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
			
		}
	}
}

public class Manage8 {

	public static void main(String[] args) {
		F ob1 = new F();
		ob1.start();
		
		F ob2 = new F();
		ob2.start();
		
		for (int i = 1000; i < 2000; i++) {
			System.out.println("From main : " + i);
		}
	}
}

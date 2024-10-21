package com.java.thread.lara;

import java.io.IOException;

class Thread1 extends Thread {
	boolean stop = false;

	public void run() {
		for (long i = 0; i < 1000000000; i++) {
			System.out.println(i);
			if (stop) {
				System.out.println(stop);
				return;
			}
		}
	}
}

public class Manage4 {

	public static void main(String[] args) throws IOException {
		Thread1 th1 = new Thread1();
		Thread t = new Thread(th1);

		t.start();
		System.in.read();
		// th1.start();

		for (int i = 1000; i < 2000; i++) {
			System.out.println("From main : " + i);
			if(i == 500)
				th1.stop = true;
				
		}
	}
}

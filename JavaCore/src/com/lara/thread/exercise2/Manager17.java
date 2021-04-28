package com.lara.thread.exercise2;

class R extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Manager17 {
	public static void main(String[] args) {
		R a = new R();
		a.start();
		System.out.println("done");
	}
}

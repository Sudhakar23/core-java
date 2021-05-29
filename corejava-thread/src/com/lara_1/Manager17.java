package com.lara_1;

class P extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
			Util.mysleep(1200);

		}
	}
}

class Q extends Thread {
	public void run() {
		for (int i = 1000; i < 2000; i++) {
			Util.mysleep(200);
			System.out.println(i);
		}
	}
}

class Util {

	public static void mysleep(long i) {
		try {

			Thread.sleep(i);
		
		} catch (Exception e) {
		}

	}
}

public class Manager17 {
	public static void main(String[] args) {
		P p = new P();
		Q q = new Q();
		System.out.println(p.getPriority());
		System.out.println(q.getPriority());
		p.start();
		q.start();
	}
}

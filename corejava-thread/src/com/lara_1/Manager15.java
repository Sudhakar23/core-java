package com.lara_1;

class M1 extends Thread {
	public void run() {
		for (int i = 1000; i < 2000; i++) {
			System.out.println(i);
		}
	}
}

public class Manager15 {
	public static void main(String[] args) {
		M1 m = new M1();
		m.setDaemon(true);
		m.start();
		System.out.println(m.isDaemon());
		for (int i = 2000; i < 4000; i++) {
			System.out.println(i);
			if (i == 2100) {
				int a = i / 0;
			}
		}
	}
}
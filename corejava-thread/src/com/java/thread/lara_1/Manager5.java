package com.java.thread.lara_1;

class C extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
			if (i == 100) {
				int f = i / 0;
			}
		}
	}
}

public class Manager5 {
	public static void main(String[] args) {
		C c = new C();
		c.start();
		for (int i = 1000; i < 2000; i++) {
			System.out.println(i);
		}
	}
}

package com.r.thread;

public class Manager15 {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(i);
				}
			}
		}.start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 100; i < 200; i++) {
					System.out.println(i);
				}
			}
		}).start();
		for (int i = 200; i < 300; i++) {
			System.out.println(i);
		}
	}
}

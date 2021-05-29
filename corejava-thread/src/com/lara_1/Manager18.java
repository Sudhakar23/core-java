package com.lara_1;

public class Manager18 {
	// int i;
	static Runnable getrRunnable() {
		return new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {

					System.out.println(i);
				}
			}
		};
	}

	public static void main(String[] args) {
		Thread ti = new Thread(getrRunnable());
		ti.start();
		for (int i = 1000; i < 2000; i++) {
			System.out.println(i);

		}
	}
}

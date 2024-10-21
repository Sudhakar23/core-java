package com.java.thread.lara.thread.util;

class Util {
	static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

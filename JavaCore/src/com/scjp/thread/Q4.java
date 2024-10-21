package com.scjp.thread;

class Q {
	private int a, b;

	public synchronized int read() {
		return (a + b);
	}

	public synchronized void set(int a, int b) {
		this.a = a;
		this.b = b;
	}
/*	public synchronized int read() {
		return (a + b);
	}
	
	public synchronized void set(int a, int b) {
		this.a = a;
		this.b = b;
	}
*/}

public class Q4 {
	public static void main(String[] args) {

	}
}

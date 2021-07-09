package com.lara.thread.lifecycle;

class Test {
}

public class Manager1 {
	public static void main(String[] args) {
		Test r = new Test();
		System.out.println(r);
		Thread.State state[] = Thread.State.values();
		for (Thread.State states : state) {
			System.out.println(states);
		}
	}
}

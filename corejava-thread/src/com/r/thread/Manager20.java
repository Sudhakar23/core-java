package com.r.thread;

public class Manager20 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		t1.setName("sudhakar");
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
		System.out.println(t1.getClass());
		System.out.println(t1.getStackTrace());
		System.out.println(t1.getState());
		System.out.println(t1.isAlive());
		System.out.println(t1.isInterrupted());
		System.out.println(t1.currentThread());
		System.out.println(t1.MIN_PRIORITY);
		System.out.println(t1.NORM_PRIORITY);
	}
}

package com.java.thread.jenkov;

public class MultipleMonitorObjects {
	private Object monitor1 = new Object();
	private Object monitor2 = new Object();
	
	private int count1 = 0;
	private int count2 = 0;
	
	public synchronized void incrementCount1() {
		this.count1++;
	}
	
	public void incrementCount2() {
		synchronized(this) {
			this.count2++;
		}
	}
}

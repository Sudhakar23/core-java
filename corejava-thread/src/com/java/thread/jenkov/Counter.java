package com.java.thread.jenkov;

class Counter {
	
	public volatile int count = 0;
	
	public boolean inc() {
		if(this.count == 1000000) {
			return false;
		}
		this.count++;
		// this 
		//read of variable
		//increment of variable
		//write of variable
		
		
//		System.out.println("count "+count);
		return true;
	}
	
	public void incCounter() {
		this.count++;
	}
	public int get() {
		return this.count;
	}
}

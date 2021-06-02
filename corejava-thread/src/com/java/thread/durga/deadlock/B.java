package com.java.thread.durga.deadlock;

public class B {
	public synchronized void work(A a){
		try{	
			Thread.sleep(300);
		}catch(InterruptedException e){
			
		}
		a.show();
	}
	public synchronized void show(){
		System.out.println("Show inside B");
		
	}
}

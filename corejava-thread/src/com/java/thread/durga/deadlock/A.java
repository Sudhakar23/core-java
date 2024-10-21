package com.java.thread.durga.deadlock;

public class A {
	public synchronized void work(B b){
		try{	
			Thread.sleep(200);
		}catch(InterruptedException e){
			
		}
		b.show();
	}
	public synchronized void show(){
		System.out.println("Show Inside A");
		
	}
}

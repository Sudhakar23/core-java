package com.lara.thread.exercise1;

class N extends Thread{
	public void run(){
		for (int i = 0; i < 1000; i++) {
			
			System.out.println(i);
//			try{
//				
//				sleep(100);
//			}catch(Exception e){}
		}
	}
}
public class Manager16 extends Thread {
public static void main(String[] args) {
	
	N n=new N();
	System.out.println("start of main");
	try{
		Manager16 m16=new Manager16();
		System.out.println(m16.getName());
		System.out.println(m16.isDaemon());
		System.out.println(m16.getId());
		n.join();
		sleep(1000);
//		Thread.sleep(1000);
		n.start();
	}catch( Exception e){
		System.out.println(e);
	}
	System.out.println("end");
}
}

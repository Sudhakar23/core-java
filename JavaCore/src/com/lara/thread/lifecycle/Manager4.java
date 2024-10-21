package com.lara.thread.lifecycle;
class D extends Thread{
	Thread main;
	D(Thread main){
		this.main=main;
	}
	public void run(){
		System.out.println(1);
		try{
			Thread.sleep(10000);
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println(main.getState());
		System.out.println(2);
	}
}
public class Manager4 {
public static void main(String[] args) {
	Thread main= Thread.currentThread();
	D d=new D(main);
	d.start();
	d.stop();
	try{
		d.join();
	}catch(Exception e){
		System.out.println(e);
	}
	System.out.println("done");
}
}

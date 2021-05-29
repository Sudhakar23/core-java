package com.lara.thread.lifecycle;
class C extends Thread{
	public synchronized void run(){
		System.out.println(1);
		try {
			wait();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(2);
	}
}
public class Manager3 {
	public static void main(String[] args) {
		C c = new C();
		c.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c.getState());
		synchronized (c) {
//			c.notify();
		}
		System.out.println("done");
	}
}

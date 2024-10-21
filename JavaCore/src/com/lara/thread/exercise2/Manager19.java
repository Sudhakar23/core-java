package com.lara.thread.exercise2;
class Util{
	static void sleep(long millis){
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
class C extends Thread{
	public void run(){
		for (int i = 0; i <10; i++) {
			System.out.println(i);
			Util.sleep(1000);
		}
	}
}
class D1 implements Runnable{
	public void run(){
		for (int i = 10; i < 20; i++) {
			System.out.println(i);
			Util.sleep(1000);
		}
	}
}
public class Manager19 {
public static void main(String[] args) {
	C c1=new C();
	c1.start();
	D1 d1=new D1();
	Thread th=new Thread();
	th.start();
	for (int i = 30; i < 40; i++) {
		System.out.println(i);
		Util.sleep(1000);
	}
}
}

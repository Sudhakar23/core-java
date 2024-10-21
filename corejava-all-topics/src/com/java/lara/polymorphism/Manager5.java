package com.java.lara.polymorphism;
class C implements Runnable{
	public void run(){
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}
public class Manager5 {
public static void main(String[] args) {
	C c1=new C();
	Thread th=new Thread(c1);
	th.start();
	//Thread th1=new Thread(c1);
	//th1.start();
	//System.out.println(th);
	for (int i =1000 ; i < 2000; i++) {
		System.out.println(i);
	}
}
}

package com.r.thread;
class D extends Thread{
	public void run(){
		for(int i=0; i< 1000; i++){System.out.println(i);
		}
	}
}
public class Manager6 {
public static void main(String[] args) {
	D d1=new D();
	//Thread th=new Thread();
	d1.start();
	System.out.println(d1);
	//D d2=new D();
	//d2.start();
	//System.out.println(d2);
	for (int i = 1000; i < 2000; i++) {
		System.out.println(i);
		
	}
}
}

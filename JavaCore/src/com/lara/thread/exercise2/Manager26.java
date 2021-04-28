package com.lara.thread.exercise2;
class I extends Thread{
	public void run(){
		for(int i=0; i<100; i++){
			System.out.println(i);
		}
		System.out.println("child end");
	}
}
public class Manager26 {
public static void main(String[] args) {
	I obj=new I();
	obj.start();
	try {
		//obj.join();
		obj.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	for(int i=100; i<200; i++){System.out.println(i);}
}
}

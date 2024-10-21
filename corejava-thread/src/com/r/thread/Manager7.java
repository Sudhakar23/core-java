package com.r.thread;
class E extends Thread{
	//E(){start();}
	public void run(){
		for (int j = 0; j < 1000; j++) {
			
			System.out.println(j);}
		}
}
public class Manager7 {
public static void main(String[] args) {
	E e=new E();
	e.run();
	e.start();
	for (int i = 1000; i < 2000; i++) {
		System.out.println(i);
	}
}
}

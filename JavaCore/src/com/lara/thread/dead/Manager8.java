package com.lara.thread.dead;
class J extends Thread{
	J(ThreadGroup tg){
		super(tg,"abc");
	}
	public void run(){
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}
class K implements Runnable{
	public void run(){
		for (int i = 1000; i < 2000; i++) {
			
			System.out.println(i);
		}
	}
}
public class Manager8 {
public static void main(String[] args) {
	ThreadGroup g1= new ThreadGroup("group1");
	J j=new J(g1);
	J j2=new J(g1);
	K k=new K();
//	Thread th=new Thread(g1,k);
//	Thread th1=new Thread(g1,k);
	j.start();
	j2.start();
//	th.start();
//	th1.start();
	//Thread t1=new Thread(k);
	
}
}

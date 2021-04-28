package com.jlc.thread1;

class HelloMyThread implements Runnable{
	HelloMyThread(){
		Thread th1 = new Thread(this);
		th1.start();
	}
	HelloMyThread(String tname){
		Thread th2 = new Thread(this,tname);
		th2.start();
	}
	HelloMyThread(ThreadGroup tg, String tname){
		Thread th3 = new Thread(tg,this,tname);
		th3.start();
	}
	public void run(){
		for(int i = 0; i<5; i++){
			System.out.println(
					Thread.currentThread().getName()
					+"Under the Thread group of :"
					+Thread.currentThread().getThreadGroup().getName()
			);
		}
	}	
}

class Reer extends Thread{} 

public class Test107 {

	public static void main(String[] args) {
		System.out.println("***In Test107***");
		ThreadGroup tg = new ThreadGroup("T-Group");
	
		new HelloMyThread("Ch-jlc-1");
		new HelloMyThread(tg,"Ch-jlc-2");
//		System.out.println("from main : "+ht1.currentThread().getId());
//		System.out.println(ht2.currentThread().getId());
		for(int i = 0;i<5;i++){
			System.out.println(
					Thread.currentThread().getName()
					+"Under the Th Grp of "
					+Thread.currentThread().getThreadGroup().getName()
			);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Try and catch");
			}
		}
	}
}



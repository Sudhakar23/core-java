package com.java.thread.durga.communication;

public class ThreadA {
	public static void main(String[] args)throws InterruptedException {
		ThreadB b = new ThreadB();
		b.setPriority(10);
		b.start();
		Thread.sleep(1000);
//		Thread.sleep(0,1);
//		b.join();
		synchronized(b){
			System.out.println("Main thread calling wait() method"); // step 1
			b.wait(5000); // waiting for 5 sec
			System.out.println("Main method get notification"); // step 4
			System.out.println(b.total); // step 5 
		}
	}
}

class ThreadB extends Thread{
	int total = 0;
	public void run(){
		synchronized (this) {
			System.out.println("Child thread starts calculation"); // step 2
			for(int i = 1; i <= 100; i++) {
				total = total + i;
			}
			System.out.println("Child thread tries to give notification"); // step 3
			this.notify();
		}
	}
}
package com.java.thread.durga.deadlock;

class MyThreadDaemon extends Thread{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(i);
		}
	}
}
public class DaemonTest {
	public static void main(String[] args) {
		MyThreadDaemon th = new MyThreadDaemon();
		th.setDaemon(true);
		th.start();
		System.out.println("Main ends");
	}
}

package com.jlc.thread.lara;

class H extends Thread {
	H(){
		start();
	}
	public void run(){
		System.out.println("child");
	}
}

public class Manage10 {

	public static void main(String[] args) {
		new H();
		System.out.println("done");
	}
}

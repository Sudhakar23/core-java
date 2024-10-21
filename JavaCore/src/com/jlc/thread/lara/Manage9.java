package com.jlc.thread.lara;

class G extends Thread {
	public void run() {
		System.out.println("child");
	}
	void test(){
		start();
	}
}

public class Manage9 {

	public static void main(String[] args) {
		G ob1 = new G();
		ob1.start();
		System.out.println("done");
	}
}

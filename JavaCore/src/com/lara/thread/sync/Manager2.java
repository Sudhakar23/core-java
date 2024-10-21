package com.lara.thread.sync;

class Stored {
	//synchronized public Object obj = null;	
	void Test1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("simple method");
			System.out.println("Test1 " + i);
		}
	}

/*	void Test2() {
		for (int i = 1000; i < 6; i++) {
			System.out.println("test 2 " + i);
		}
	}

	synchronized void Test3() {
		for (int i = 0; i < 5; i++) {
			System.out.println("test 3 " + i);
		
		}
	}*/

	static synchronized void Test4() {
		for (int i = 0; i < 5; i++) {
			System.out.println("synchronized method");
			System.out.println("test 4 " + i);
		}
	}

	static void Test5() {
		for (int i = 0; i < 5; i++) {
			System.out.println("static method");
			System.out.println("test 5 " + i);
		}
	}

	/*static void Test6() {
		for (int i = 0; i < 5; i++) {
			System.out.println("test 6 " + i);
		}
	}*/

	/*synchronized void Test7() {
		for (int i = 0; i < 5; i++) {
			System.out.println("test 7 " + i);
		}
	}

	synchronized void Test8() {
		for (int i = 0; i < 5; i++) {
			System.out.println("test 8 " + i);
		}
	}*/
}

class Thread1 extends Thread {
	Stored s1;

	public Thread1(Stored s1) {

		this.s1 = s1;
	}

	public void run() {
		s1.Test5();
		s1.Test1();
		s1.Test4();
		
		}
}

/*class Thread2 extends Thread {
	Stored s1;

	public Thread2(Stored s1) {

		this.s1 = s1;
	}

	public void run() {
		s1.Test2();
	}
}*/

public class Manager2 {
	public static void main(String[] args) {
		Stored s1 = new Stored();
		//Stored s2 = new Stored();
		Thread1 t1 = new Thread1(s1);
		//Thread2 t2 = new Thread2(s2);
	//t2.start();*/
		t1.start();

	}
}

package com.java.stream;


class X extends Thread{
	public void run() {
		try {
			Thread.sleep(300L);
			System.out.println("Thread X...");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Y implements Runnable{
	public void run() {
		try {
			Thread.sleep(500L);
			System.out.println("Thread Y...");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
public class PrintStar {
	public static void main(String[] args) {
		int x=0, a=2, b=4,c=5;
		x = a-- + b++ - ++c;
		String str = "";
		System.out.println(x);
		Thread z = new Thread(new X());
		boolean bb = true;
	}
}

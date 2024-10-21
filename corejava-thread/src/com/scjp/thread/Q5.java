package com.scjp.thread;

public class Q5 {
	public static void main(String[] args) {
		String a = " ";
		System.out.println("1");
		synchronized (a) {
			System.out.println("2");
			
			try {
				a.wait(
						);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("3");
	}
}

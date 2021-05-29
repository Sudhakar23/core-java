package com.lara.thread.lifecycle;

class Anu extends Thread {
	public void run() {
		/*for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}*/
		System.out.println(1);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(2);
	}
}

public class Manager2 {
	public static void main(String[] args) {
		
		Anu a = new Anu();
		//System.out.println(a.getState());
		a.start();
		/*try {
			a.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/		System.out.println(a.getState());
		//System.out.println(a.getState());
	}
	
}

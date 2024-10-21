package com.java.jlc.thread;

class Account {
	 synchronized void withDraw() {
		System.out.println("Withdraw in Accounts");
		for (int i = 0; i < 5; i++) {
			String st =""; 
			System.out.println("Withdraw : " + Thread.currentThread().getName()
					+ " Under the main threadgroup "
					+ Thread.currentThread().getThreadGroup().getName());
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}
	 synchronized void deposit(){
		for(int i = 0; i< 3 ; i++){
			System.out.println("Deposit :" 
					+Thread.currentThread().getName()
					+" Under the main threadGroup :"
					+Thread.currentThread().getThreadGroup().getName()
					);
			try{
				Thread.sleep(500);
			}catch(Exception e){
				
			}
		}
	}
}
class MyThread1 implements Runnable{
	String tname = null;
	Account acc = null;
	public MyThread1(String tname, Account acc) {
		this.tname = tname;
		this.acc = acc;
		
		Thread t1 = new Thread(this, tname);
		t1.start();
	}
	public void run(){
		acc.deposit();
	}
	
}
class MyThread2 implements Runnable{
	String tname = null;
	Account acc = null;
	public MyThread2(String tname, Account acc) {
		this.tname = tname;
		this.acc = acc;
		
		Thread t2 = new Thread(this, tname);
		t2.start();
	
	}
	public void run(){
		acc.deposit();
	}
	
}

public class Test108 {
	public static void main(String[] args) {
		Account acc = new Account();
		Account acc1 = new Account();
		
		new MyThread1("Th1_A", acc);
		new MyThread2("Th1_B", acc);
	}
}
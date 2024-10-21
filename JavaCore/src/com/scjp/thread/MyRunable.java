package com.scjp.thread;
class S implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
public class MyRunable  {

	public static void main(String[] args) {
		
	Runnable r=new S();
	Thread t=new Thread(r);

	}

}

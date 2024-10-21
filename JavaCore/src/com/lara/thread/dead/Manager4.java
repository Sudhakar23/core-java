package com.lara.thread.dead;
class S{
	synchronized void test(){
		Thread t=Thread.currentThread();
		System.out.println(t.getName()+"is going to waiting");
		try{
			wait();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(t.getName()+"is return to active");
	}

synchronized void Test2(){
	notifyAll();
}
}
class Sonam extends Thread{
	S s1;
	Sonam(S s1){
		this.s1=s1;
	}
	public void run(){
		s1.test();
	}
}
class Sultana extends Thread{
	S s1;
	Sultana(S s1){
		this.s1=s1;
	}
}
public class Manager4 {
public static void main(String[] args) {
	S s1=new S();
	S s2=new S();
	Sonam s3=new Sonam(s1);
	Sultana s4=new Sultana(s2);
	s3.start();
	s4.start();
	try{
		Thread.sleep(5000);
	}catch(Exception e){
		System.out.println(e);
	}
	s1.Test2();
	s2.Test2();
}
}

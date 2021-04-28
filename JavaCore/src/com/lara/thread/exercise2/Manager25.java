package com.lara.thread.exercise2;
class H extends Thread{
	public void run(){
		for(int i=0; i<3000; i++){System.out.println(i);}
	}
}
public class Manager25 {
public static void main(String[] args) {
	H obj=new H();
	obj.start();
	System.out.println("done");
}
}

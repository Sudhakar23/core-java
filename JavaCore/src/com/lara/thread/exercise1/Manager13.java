package com.lara.thread.exercise1;
class K extends Thread{
	 public void run(){
		 for (int i = 0; i < 1000; i++) {
			 System.out.println(i);
		 }
	 }
}
public class Manager13 {
public static void main(String[] args) {
	K k1=new K();
	k1.setName("rupsi");
	k1.start();
	for (int i = 1000; i < 2000; i++) {
		System.out.println(i);
	}
}
}

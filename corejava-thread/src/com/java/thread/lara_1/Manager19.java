package com.java.thread.lara_1;

public class Manager19 {
static Thread getThread(){
	Thread ti=new Thread(){
			public void run() {
				for (int i = 0; i <1000; i++) {
					System.out.println(i);
				}
			}
	} ;
	return ti;
	}
public static void main(String[] args) {
	Thread t=getThread();
	t.start();
	for (int i = 1000; i <2000; i++) {
		System.out.println(i);
	}
}
}


package com.lara.thread.exercise2;

public class Manager14 {
public static void main(String[] args) {
	Thread th=new Thread(){
		public void run(){
		for(int i=0; i<100; i++){System.out.println(i);}	
		}
	};
	Runnable rn=new Runnable() {
		
		@Override
		public void run() {
			for(int i=100; i<200; i++){System.out.println(i);}
		}
	};
	//rn.run();
	th.start();
	Thread th1=new Thread();
	th1.run();
	//Thread th2=new Thread();
	//th2.start();
	for (int i = 200; i < 300; i++) {
		System.out.println(i);
	}
}
}

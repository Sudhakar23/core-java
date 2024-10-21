package com.java.collection.jenkov.QueueDequeStack;

import java.util.LinkedList;
import java.util.Queue;

interface Interface1{
	public void m1();
}

interface Interface2{
	public void m2();
}
 
class Test implements Interface1, Interface2{

	@Override
	public void m2() {
		System.out.println("method m2()");
	}

	@Override
	public void m1() {
		System.out.println("method m1()");
		
	}
	
}

public class QueueTest  {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList();
		for (int i = 0; i < 10; i++) {
			queue.add("java");
		}
		System.out.println(queue);
		System.out.println(queue.size());
		for (int i = 0; i < queue.size(); i++) {
			System.out.println(queue.size());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(queue.poll());
		}
		System.out.println(queue);
		System.out.println(queue.size());
		
	}
}

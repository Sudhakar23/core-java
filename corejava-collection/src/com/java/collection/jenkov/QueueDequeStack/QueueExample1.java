package com.java.collection.jenkov.QueueDequeStack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueExample1 {
	public static void main(String[] args) {
		List<Customer> list = new ArrayList();
		Queue<Customer> queue = new LinkedList();
		
		queue.add(new Customer("Anna"));
		queue.add(new Customer("Nick"));
		System.out.println(queue);
		
		list.add(new Customer("Anna"));
		list.add(new Customer("Nick"));
		System.out.println(list);
		
		Customer anna = queue.poll(); // removing element from begining of the queue
		Customer nick = queue.poll(); // removing element from begining of the queue
		
		System.out.println(anna.getName());
		System.out.println(nick.getName());
		System.out.println(queue);
	}
}

class Customer{
	private String name;

	
	public Customer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name+" ";
	}
}

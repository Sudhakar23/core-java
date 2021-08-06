package com.java.collection.jenkov.QueueDequeStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		
		//Queue mode
		deque.offerLast("Element 1");
		deque.offerLast("Element 2");
		System.out.println(deque);
		
		
		String element1 = deque.pollFirst();
		String element2 = deque.pollFirst();
		
		System.out.println(element1);
		System.out.println(element2);

		
		//Stack mode
		deque.offerFirst("Element 1");
		deque.offerFirst("Element 2");
		System.out.println(deque);
		
		String element3 = deque.pollFirst();
		String element4 = deque.pollFirst();
		
		System.out.println(element3);
		System.out.println(element4);
		
		
	}

}

package com.java.collection.myScjpDump;

import java.util.PriorityQueue;

public class PQ {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("carrot");
		pq.add("apple");
		pq.add("banana");
		System.out.println(pq.poll() + " ");
		System.out.println(pq);
		System.out.println(pq.peek() + " ");
		System.out.println(pq);
		System.out.println(pq.poll() + ":" + pq.peek());
	}
}

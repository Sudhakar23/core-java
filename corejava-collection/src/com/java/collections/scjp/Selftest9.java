package com.java.collections.scjp;

import java.util.PriorityQueue;

public class Selftest9 {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("8");
		pq.add("6");
		pq.add("4");
		pq.add("2");
		System.out.println(pq);
		System.out.println(pq.peek() + " ");
		// System.out.println(pq);
		pq.offer("1");
		pq.add("3");
		// pq.remove("1");
		//System.out.println(pq);
		System.out.println(pq.poll() + " ");
		//System.out.println(pq);
		if (pq.remove("2"))
			System.out.println(pq.poll() + " ");
		{
			System.out.println(pq.poll() + " " + pq.peek());
			System.out.println(pq);
		}
	}
}

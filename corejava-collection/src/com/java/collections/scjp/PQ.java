package com.java.collections.scjp;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ {
	static class PQsort implements Comparator<Integer>{
		public int compare(Integer one, Integer two){
			return two-one;
		}
	}
public static void main(String[] args) {
	int[] ia={1,5,3,7,4,8,2,9,6};
	/*PriorityQueue<Integer> pq1=new PriorityQueue<Integer>();
	for (int x : ia) 
		pq1.offer(x);
		for (int x : ia) 
			System.out.println(pq1.poll()+ " ");
		
		System.out.println(pq1);*/
	
	PQsort pqs=new PQsort();
	PriorityQueue<Integer>pq2=new PriorityQueue<Integer>(10,pqs);
	for (int x : ia) 
	pq2.offer(x);
	//System.out.println(pq2);
	System.out.println("size" +pq2.size());
	System.out.println("peek" +pq2.peek());
	System.out.println("size" +pq2.size());
	System.out.println("poll" +pq2.poll());
	System.out.println("size" +pq2.size());
	for (int x : ia) 
		System.out.print(pq2.poll() +" ");
	//System.out.print(pq2);
	//System.out.print(pq2.peek() +" ");
	
}
}

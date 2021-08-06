package com.java.collection.jenkov.QueueDequeStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseEltOfListUsingStack {
	public static void main(String[] args) {
		Stack<String> stack = new Stack();
		List<String> list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		System.out.println("list ** "+list);
		while(list.size() > 0) {
			String remove = list.remove(0);
			System.out.println(remove);
			System.out.println("list "+list);
			stack.push(remove);	
		}
		System.out.println("stack " +stack);
		
		while(stack.size() > 0) {
			list.add(stack.pop());
		}
		
		System.out.println("stack 2" +stack);
		System.out.println("llist	 2" +list);
		
	}
}

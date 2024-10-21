package com.java.collection.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveEltList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.remove(2);
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}

package com.java.collection.core;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// UnsupportedOperationException example
public class CopyOnWriteArrayList_Example1 {
	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		System.out.println(list);
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {

			if (it.next() == 2) {
				it.remove();
			}
		}
		System.out.println(list);
	}
}

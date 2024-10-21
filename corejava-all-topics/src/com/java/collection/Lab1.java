package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
public class Lab1 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(new Integer(3));
		al.add(2);
		al.add(0);
//		al.add(new Integer(03));
		System.out.println(al);
		Object ob = al.toArray();
		List list = al.subList(0, 3);
		
		System.out.println(list);
		System.out.println(al);
		al.removeAll(al);
		System.out.println(al);
		al.retainAll(al);
		System.out.println(al);
	}
}

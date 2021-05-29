package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
public class Lab1 {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList();
		al.add(new Integer(1));
		al.add(new Integer(3));
		al.add(new Integer(24));
//		al.add(14);
//		al.add(10);
//		al.add(11);
		System.out.println(al);

//				Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		//		al.add(new Integer(03));
//		System.out.println(al);
//		Object ob = al.toArray();
//		List list = al.subList(0, 3);
//		
//		System.out.println(list);
//		System.out.println(al);
//		al.removeAll(al);
//		System.out.println(al);
//		al.retainAll(al);
//		System.out.println(al);
		
	}
}

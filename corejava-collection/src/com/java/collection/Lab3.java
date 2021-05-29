package com.java.collection;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Vector;

public class Lab3 {
	public static void main(String[] args) {
		final Vector v = new Vector();
		v.add(34);
		v.add(34);
		v.add("con");
		System.out.println(v);
		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			System.out.print(e.nextElement()+" ");
		}
		LinkedList ll = new LinkedList(v);
		ll.addFirst("11");
	}
}
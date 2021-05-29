package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Lab8 {
	public static void main(String[] args) {
//		ArrayList al = new ArrayList();
//		al.add("bb");
//		al.add("aa");
//		al.add("cc");
//		al.add("ee");
//		al.add("dd");
//		System.out.println(al);
//		System.out.println(Collections.binarySearch(al, "bb"));
//		System.out.println(Collections.binarySearch(al, "aa"));
//		System.out.println(Collections.binarySearch(al, "cc"));
//		System.out.println(Collections.binarySearch(al, "ee"));
//		System.out.println(Collections.binarySearch(al, "dd"));
//		Collections.sort(al);
//		System.out.println(al);
//
//		Collections.swap(al, 0, 1);
//		System.out.println(al);
//		System.out.println(Collections.max(al));
//		System.out.println(Collections.min(al));
		
		Vector v = new Vector();
		v.add("99");
		v.add("sri");
		v.addElement("99");
		System.out.println(v);
		Enumeration e = v.elements();
		List al1 = Collections.list(e);
		System.out.println(al1);
//		Collections.sort(al);
//		System.out.println(al);
	}
}
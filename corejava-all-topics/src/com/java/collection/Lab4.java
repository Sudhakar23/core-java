package com.java.collection;

import java.util.*;

public class Lab4 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(11);
		System.out.println(hs.add("tom"));
		hs.add("con");
		hs.add(null);
		hs.add("con");
		hs.add(null);
		hs.add(11);
		hs.add(31);
		hs.add(11);
		System.out.println(hs);
		TreeSet ts = new TreeSet();
		ts.add("41");
		ts.add("31");
		ts.add("caa");
		ts.add("bb");
		ts.add("abb");
		ts.add(12);
		System.out.println(ts);
	}
}

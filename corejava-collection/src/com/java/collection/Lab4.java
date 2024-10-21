package com.java.collection;

import java.util.*;

public class Lab4 {
	public static void main(String[] args) {
		Set hashSet = new HashSet();
		hashSet.add(11);
		System.out.println(hashSet.add("tom"));
		hashSet.add("con");
		hashSet.add(null);
		hashSet.add("con");
		hashSet.add(null);
		hashSet.add(11);
		hashSet.add(31);
		hashSet.add(11);
		System.out.println(hashSet);
		Set treeSet = new TreeSet();
		treeSet.add("41");
		treeSet.add("31");
		treeSet.add("caa");
		treeSet.add("bb");
		treeSet.add("abb");
		treeSet.add(12);
		System.out.println(treeSet);
		int a = 1, b = 2;
		System.out.println(a|b);
	}
}

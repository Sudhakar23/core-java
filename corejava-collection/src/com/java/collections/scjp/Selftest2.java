package com.java.collections.scjp;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Selftest2 {
	public static void before(){
		Set set=new TreeSet();
		set.add("2");
		set.add(4);
		set.add("3");
		Iterator  it=set.iterator();
		while(it.hasNext());
		System.out.println(it.next() + " ");
		
		
	}
public static void main(String[] args) {
	Selftest2 s2=new Selftest2();
	s2.before();
}
}

package com.java.collections.scjp;

import java.util.TreeSet;

public class Selftest12 {
public static void main(String[] args) {
	TreeSet<String> s=new TreeSet<String>();
	TreeSet<String> subs=new TreeSet<String>();
	s.add("a");
	s.add("b");
	s.add("c");
	s.add("d");
	s.add("e");
	System.out.println(subs);
	subs=(TreeSet)s.subSet("b", true ,"d", true);
	System.out.println(subs);
	s.add("g");
	System.out.println(subs);
	s.pollFirst();
	s.pollFirst();
	//System.out.println(s);
	s.add("h2");
	//System.out.println(s);
	System.out.println(s.size() +" "+ subs.size());
}
}

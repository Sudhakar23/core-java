package com.java.collection.myhashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Myhset {
public static void main(String[] args) {
	HashSet set=new HashSet();
	set.add(33);
	set.add(3);
	set.add(30);
	set.add(23);
	set.add(53);
	TreeSet s1=new TreeSet();
	s1.addAll(set);
	TreeSet s2=new TreeSet(Collections.reverseOrder());	
	s2.addAll(set);
	System.out.println(s1);
	System.out.println(s2);
}
}

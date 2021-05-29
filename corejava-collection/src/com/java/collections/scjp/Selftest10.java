package com.java.collections.scjp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Selftest10 {
public static void main(String[] args) {
	Object o=new Object();
	//Set s=new HashSet<>();
	TreeSet s1=new TreeSet();
//LinkedHashSet s2=new LinkedHashSet();
	s1.add("o");
	s1.add(o);
	System.out.println(s1);
}
}

package com.java.collection.lara;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Manager3 {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(33);
	al.add(35);
	//al.add("jlcindia");
	al.add(36);
	al.add(31);
	al.add(37);
	al.add(31);
	al.add(45);
	al.add(25);
	al.add(25);
	al.add(45);
	al.add(48);
	TreeSet ts=new TreeSet(al);
	
	///Collections.sort(al,Collections.reverseOrder());
	System.out.println(al);
	System.out.println(ts);
}
}

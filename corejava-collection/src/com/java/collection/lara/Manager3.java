package com.java.collection.lara;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Manager3 {
public static void main(String[] args) {
	List al=new ArrayList();
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
	Set ts=new TreeSet(al);
	Object obj = null;
	
	///Collections.sort(al,Collections.reverseOrder());
	System.out.println(al);
	System.out.println(ts);
	Manager3 manager3 = new Manager3();
	System.out.println(manager3.hashCode());
}
}

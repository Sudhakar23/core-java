package com.java.collection.map.programs;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class VectorClass {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add(90);
	v.add(190);
	v.add(290);
	v.add(94);
	v.add(90);
	v.add(98);
	v.add(100);
	v.add(66);
	System.out.println(v);
	
	/*Enumeration enum1=v.elements();
	while (enum1.hasMoreElements()) {
		System.out.println(enum1.nextElement());
		
	}*/
}
}

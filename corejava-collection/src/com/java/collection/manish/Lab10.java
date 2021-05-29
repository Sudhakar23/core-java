package com.java.collection.manish;

import java.util.Enumeration;
import java.util.Vector;

public class Lab10 {
public static void main(String[] args) {
	Vector v=new Vector();
	v.addElement("abc");
	v.addElement("def");
	v.addElement("ghi");
	v.addElement("xyz");
	v.addElement("qqq");
	System.out.println(v);
	System.out.println(v.elementAt(0));
	v.addElement("abc");
	System.out.println(v);
	v.removeElementAt(1);
	System.out.println(v);
	System.out.println("\n** ELEMENTS");
	Enumeration en=v.elements();
	while(en.hasMoreElements()){
		System.out.println(en.nextElement());
	}
}
}

package com.java.collection.manish;

import java.util.ArrayList;
import java.util.List;

public class Lab6 {
public static void main(String[] args) {
	List l=new ArrayList();
	l.add("sri");
	l.add("nivash");
	l.add("manish");
	l.add("kumar");
	System.out.println(l);
	/*System.out.println("get(2)"+l.get(2));
	System.out.println("set(2...)"+l.set(3, "suresh"));
	System.out.println(l);
*/	System.out.println("adding the elements");
	l.add(1,"kumari");
	System.out.println(l);
	System.out.println("remove elements;"+l.remove(3));
	System.out.println(l);
	System.out.println("indexOf(nivash)"+l.indexOf("nivash"));
}
}
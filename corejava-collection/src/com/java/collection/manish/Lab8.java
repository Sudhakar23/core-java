package com.java.collection.manish;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Lab8 {
public static void main(String[] args) {
	List l=new ArrayList();
	l.add("dande");
	l.add("manish");
	l.add("nivash");
	
	System.out.println(l);
	Iterator it=l.iterator();
	while(it.hasNext()){
		Object obj=it.next();
		System.out.println(obj);
		if (obj.equals("manish")) {
			it.remove();
		}
	}
	System.out.println(l);
}
}

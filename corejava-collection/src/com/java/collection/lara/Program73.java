package com.java.collection.lara;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Program73 {
public static void main(String[] args) {
	ArrayList list=new ArrayList();
	list.add(9);
	list.add(0);
	list.add(5);
	list.add(4);
	/*list.add(19);
	list.add(90);
	list.add(29);
	list.add(5);
	System.out.println(Collections.max(list));
	System.out.println(Collections.min(list));*/
	System.out.println(list);
	System.out.println("----");
	Iterator it=list.iterator();
	while(it.hasNext()){
		System.out.println(it.next()+"," );
	}
	//System.out.println();
	System.out.println("-----");
	while(it.hasNext()){
		System.out.println(it.next() );
	}
	/*ListIterator lit=list.listIterator();
	while(lit.hasNext()){
		System.out.println(lit.next()+",");
	}*/
}
}

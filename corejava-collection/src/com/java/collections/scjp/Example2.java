package com.java.collections.scjp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Inserter{
	void insert(List<Integer> list){
		list.add(new Integer(42));
	}
}
public class Example2 {
public static void main(String[] args) {
	List<Integer> mylist=new ArrayList<Integer>();
	mylist.add(4);
	mylist.add(6);
	Inserter in=new Inserter();
	in.insert(mylist);
	Iterator i=mylist.iterator();
	while (i.hasNext()) {
		System.out.println(i.next());


		
	}
	
	System.out.println();
}
}

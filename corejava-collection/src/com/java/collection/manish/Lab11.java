package com.java.collection.manish;

import java.util.LinkedList;

public class Lab11 {
public static void main(String[] args) {
	LinkedList list=new LinkedList();
	list.add("sri");
	list.add("nivash");
	list.add("dande");
	System.out.println(list);
	list.add("ajay");
	list.add("kumar");
	System.out.println(list);
	System.out.println(list.getFirst());
	System.out.println(list.getLast());
}
}

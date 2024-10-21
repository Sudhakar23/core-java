package com.java.collection;

import java.util.*;

public class Lab2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Integer(12));
		al.add("com");
		al.add("tom@gmail");
		System.out.println(al);
		System.out.println(al.get(2));
		al.set(0, "xat");
		al.add(0,"dog");
		System.out.println(al);
		ListIterator li = al.listIterator();
		System.out.println("has pre");
		while(li.hasPrevious()){
			System.out.print(li.previous()+" - ");
		}
		System.out.println("has next");
		while(li.hasNext()){
			System.out.print(li.next()+" - ");
		}
		System.out.println();
	}
}

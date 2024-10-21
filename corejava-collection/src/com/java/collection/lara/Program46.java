package com.java.collection.lara;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Program46 {
public static void main(String[] args) {
	//Program46 list1=new Program46();
	ArrayList list1=new ArrayList();
	list1.add(90);
	//zlist1.add(90.9);
	list1.add(190);
	list1.add(19);
	list1.add(9);
	/*System.out.println(list1);*/
	list1.add(100);
	list1.add(50);
	list1.add(1);
	list1.add(14);
	list1.add(10);
	System.out.println(list1);
	Comparator ctr=Collections.reverseOrder();
	Collections.sort(list1,ctr);
	//Collections.sort(list1);
	System.out.println(list1);
	/*ArrayList list2=new ArrayList();
	list2.add(5);
	list2.add(3);
	list2.add(6);
	list2.add(7);*/
	//list1.remove(3);
	//list2.addAll(list1);
	//System.out.println(list1);
	//System.out.println(list2);
	//System.out.println("list2==");
	//list1.addAll(list2);
	//list1.removeAll(list2);
	//list1.retainAll(list2);
	//list1.set(2, "abe");
	/*System.out.println(list1.contains(90));
	System.out.println(list1.contains(80));*/
	//System.out.println(list2);
	/*list1.clear();
	System.out.println(list1);*/
	/*System.out.println("--------");
	boolean bl=list1.remove(new Integer(2));
	System.out.println(list1);
	System.out.println("aaaaaa");
	System.out.println(bl);
	bl=list1.remove(new Integer(12));
	System.out.println("tttt");
	System.out.println(bl);*/
	/*Object obj=list1.remove(3);
	System.out.println(list1);
	System.out.println(obj);
	obj=list1.remove(6);
	System.out.println(obj);*/
}
}

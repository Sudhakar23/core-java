package com.java.collections.scjp;

import java.util.TreeMap;
import java.util.TreeSet;

public class Selftest13 {
public static void main(String[] args) {
	TreeMap<String, String> myMap=new TreeMap<String, String>(); 
	myMap.put("a", "apple");
	myMap.put("d", "date");
	myMap.put("f", "fig");
	myMap.put("p", "pear");
	//	myMap.put("q", "queen");
	System.out.println("1st after mango: " +myMap.higherKey("f"));
	System.out.println("2st after mango: " +myMap.lowerKey("f"));
	System.out.println("3st after mango: " +myMap.ceilingKey("f"));
	System.out.println("4st after mango: " +myMap.floorKey("f"));
	System.out.println("5st after mango: " +myMap.tailMap("f"));
	System.out.println("6st after mango: " +myMap.firstKey());
	
}
}

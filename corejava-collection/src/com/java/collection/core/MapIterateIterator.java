package com.java.collection.core;

import java.util.*;
public class MapIterateIterator {
public static void main(String[] args) {
	Map<Integer,String> map=new HashMap();
	map.put(1, "avinash");
	map.put(2, "sudhakar");
	map.put(4, "Rajesh");
	map.put(5, "anand");
	Set it=map.keySet();
	Iterator it1=it.iterator();
	while (it1.hasNext()) {
		Object type = it1.next();
		Object value=map.get(type);
		System.out.println("key= " +type+" value== "+value);
	}
}
}

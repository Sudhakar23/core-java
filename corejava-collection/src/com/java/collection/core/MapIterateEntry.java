package com.java.collection.core;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapIterateEntry {
public static void main(String[] args) {
	Map<Integer, Integer> map=new HashMap();
	map.put(1, 4);
	map.put(2, 8);
	map.put(3, 5);
	map.put(4, 6);
	for (Map.Entry<Integer, Integer> entry:map.entrySet()) {
		System.out.println("key="+entry.getKey()+"value="+entry.getValue());
	}
	Hashtable h=new Hashtable<>();
}
}

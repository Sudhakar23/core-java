package com.java.collection.myhashset;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
public static void main(String[] args) {
	TreeMap<Integer, String> tm=new TreeMap();
	tm.put(3, "v");
	tm.put(46, "t");
	tm.put(44, "t");
	tm.put(23, "r");
	tm.put(6, "a");
	tm.put(5, "f");
	Set keySet = tm.keySet();
	System.out.println(tm.ceilingKey(30));
	System.out.println(tm.higherEntry(44) +"&& ");
	System.out.println(tm.floorKey(10));
	Map map=tm.descendingMap();
	System.out.println(map);
}
}

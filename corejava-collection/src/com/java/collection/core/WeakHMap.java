package com.java.collection.core;

import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHMap {
	public static void main(String[] args) {
		Map map = new WeakHashMap();
		map.put(new Integer(10), 10);
		map.put(new Integer(20), 20);
		map.put(new Integer(30), 30);
		System.out.println(map.size());
		System.gc();
		System.out.println(map.size());
		Collections.unmodifiableMap(map);
	}
}

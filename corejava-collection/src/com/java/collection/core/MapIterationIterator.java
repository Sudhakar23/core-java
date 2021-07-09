package com.java.collection.core;

import java.util.*;

public class MapIterationIterator {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap();
		hashMap.put(1, "Moni");
		hashMap.put(2, "Sudhakar");
		hashMap.put(4, "Chandra");
		hashMap.put(5, "Babu");

		Set set = hashMap.keySet();
		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {
			Object type = iterator.next();
			Object value = hashMap.get(type);
			System.out.println("key= " + type + " value== " + value);
		}
	}
}

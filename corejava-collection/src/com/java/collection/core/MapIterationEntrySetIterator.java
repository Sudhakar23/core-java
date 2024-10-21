package com.java.collection.core;

import java.util.*;
import java.util.Map.Entry;

public class MapIterationEntrySetIterator {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap();
		hashMap.put(1, "Moni");
		hashMap.put(2, "Sudhakar");
		hashMap.put(4, "Chandra");
		hashMap.put(5, "Babu");

		Iterator<Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() +" " +entry.getValue() );
		}
	}
}

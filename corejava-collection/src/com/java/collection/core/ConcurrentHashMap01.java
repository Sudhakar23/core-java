package com.java.collection.core;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap01 {
	public static void main(String[] args) {

		ConcurrentHashMap<String, String> map = new ConcurrentHashMap();
		map.putIfAbsent("1", "1");
		map.putIfAbsent("2", "2");
		map.putIfAbsent("3", "3");

		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, String>> entry = entrySet.iterator();

		while (entry.hasNext()) {
			map.put("6", "6");
			map.putIfAbsent("5", "5");
			System.out.println(entry.next());
		}
		System.out.println("===");

		HashMap hashmap = new HashMap();
		hashmap.put("1", "1");
		hashmap.put("2", "2");
		hashmap.put("4", "3");
		hashmap.put("5", "3");
		hashmap.put("6", "3");
		hashmap.put("7", "3");
		hashmap.put("8", "3");
		hashmap.put("9", "3");
		hashmap.put("10", "3");
		hashmap.put("11", "3");
		hashmap.put("12", "3");

		Set hashMapSet = hashmap.entrySet();
		Iterator entr = hashMapSet.iterator();
		while (entr.hasNext()) {
			hashmap.put("5", "5");
			System.out.println(entr.next());
		}

	}
}
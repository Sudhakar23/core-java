package com.java.collection.core;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapIterationEntry {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap();
		map.put("Jharkhand", "Ranchi");
		map.put("Chatisgadh", "Raipur");
		map.put("West Bengal", "Kolkata");
		map.put("Bihar", "Patna");

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("key = " + entry.getKey() + "   value = " + entry.getValue());
		}
	}
}

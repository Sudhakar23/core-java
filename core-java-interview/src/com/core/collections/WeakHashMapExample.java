package com.core.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class WeakHashMapExample {

	public static void main(String[] args) {
		Map<Number, String> weakHashMap = new WeakHashMap<Number, String>();
		weakHashMap.put(1, "A");
		weakHashMap.put(2, "B");
		weakHashMap.put(3, "C");
		
		Set set1 = weakHashMap.entrySet();
		System.out.println("Set: "+set1);
		
		// Creating set for key
		Set keySet = weakHashMap.keySet();
		System.out.println("Key Set: " + keySet);
		
		Collection value  = weakHashMap.values();
		System.out.println("Map Values: " + value);
	}
}

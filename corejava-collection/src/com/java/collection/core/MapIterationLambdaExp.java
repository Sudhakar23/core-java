package com.java.collection.core;

import java.util.*;
import java.util.Map.Entry;

public class MapIterationLambdaExp {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap();
		hashMap.put(1, "Moni");
		hashMap.put(2, "Sudhakar");
		hashMap.put(4, "Chandra");
		hashMap.put(5, "Babu");

		Set<Integer> keySet = hashMap.keySet();
		
		for (Integer key : keySet) {
			System.out.println("Key " +key +" " + " Value " +hashMap.get(key));
		}
		
	}
}

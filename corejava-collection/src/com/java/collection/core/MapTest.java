package com.java.collection.core;

import java.util.*;
import java.util.Map.Entry;

public class MapTest {
	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap();
		map.put(1,"India");
		map.put(2,"Nepal");
		map.put(3,"India");
		map.put(4,"Burma");
		map.put(5,"pakistan");
		map.put(6,"India");
		map.put(7,"India");
		map.put(8,"SriLanka");
		
		
		Set<Entry<Integer, String>> set = map.entrySet();
		List<Entry<Integer, String>> list = new ArrayList(set);
		Collections.reverse(list);
		
		Map newMap = new LinkedHashMap();
		
		for(Map.Entry<Integer, String> mape : list){
			if(!newMap.containsValue(mape.getValue())){
				newMap.put(mape.getKey(), mape.getValue());
			}
		}
		System.out.println(newMap);
	}
}

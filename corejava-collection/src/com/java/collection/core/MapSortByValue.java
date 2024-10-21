package com.java.collection.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*Sorting by value and if value is same then sort by key*/
public class MapSortByValue {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		map.put("Amit", 20);
		map.put("Rajesh", 24);
		map.put("Suresh", 45);
		map.put("Nitin", 24);
		map.put("Unix", 67);
		map.put("Anil", 24);
		map.put("kohavi", 98);

		List<Entry<String, Integer>> list = new ArrayList(map.entrySet());
		System.out.println(list);
		System.out.println("========================");
		
		//Collections.sort(list, new SortByValue());
		
		// Java 8 Lambda expression 
		Collections.sort(list, (Entry<String, Integer> o1, Entry<String, Integer> o2) -> {
				if(o1.getValue().equals(o2.getValue()))
					return o1.getKey().compareTo(o2.getKey());
				else
					return o1.getValue().compareTo(o2.getValue());
		});
		
		// Java anonymos class
//		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				// TODO Auto-generated method stub
//				if(o1.getValue().equals(o2.getValue()))
//					return o1.getKey().compareTo(o2.getKey());
//				else
//					return o1.getValue().compareTo(o2.getValue());
//			}
//		});
//		
		for (Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " \t== " + entry.getValue());
		}
		
	}
}

class SortByValue implements Comparator<Map.Entry<String, Integer>> {
	public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
		
		if(o1.getValue().equals(o2.getValue()))
			return o1.getKey().compareTo(o2.getKey());
		else 
			return o1.getValue().compareTo(o2.getValue());
			
	}
}

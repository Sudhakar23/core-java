package com.java.collection.core;

import java.util.*;
import java.util.Map.Entry;

public class MapSortByValue {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		map.put("java", 20);
		map.put("c++", 45);
		map.put("Java2Novice", 2);
		map.put("Unix", 67);
		map.put("kolaveri", 98);

		Set<Entry<String, Integer>> set = map.entrySet();
		System.out.println(set);
		List<Entry<String, Integer>> list = new ArrayList(set);
		System.out.println(list);
		System.out.println("========================");
		Collections.sort(list, new SortByValue());
		for (Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " ==== " + entry.getValue());
		}
	}
}

class SortByValue implements Comparator<Map.Entry<String, Integer>> {
	public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
		// TODO Auto-generated method stub
		 return o1.getValue().compareTo(o2.getValue());
//		return o1.getKey().compareTo(o2.getKey());
	}
}

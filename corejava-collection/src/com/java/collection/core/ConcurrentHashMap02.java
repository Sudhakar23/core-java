package com.java.collection.core;

import java.util.*;

public class ConcurrentHashMap02 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("1", "Ashutosh");
		map.put("2", "Rakesh");
		map.put("3", "Saurabh");
		map.put("4", "KUMAR");
		Set set = map.keySet();
		// System.out.println(set);
		Object value, key;
		// Collection c=map.values();
		// System.out.println(c);
		Set s1 = map.entrySet();

		Iterator it = s1.iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			// System.out.println(me.getKey()+"  "+me.getValue());
			/*
			 * key=it.next(); value=map.get(key);
			 * System.out.println(key+"  "+value);
			 */
			if (me.getKey().equals("3")) {
				me.setValue("ashu");
			}
			System.out.println(me);
		}
	}
}

package com.java.collection.myhashset;

import java.util.*;

public class MapIterate {
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put(1, "Amit");
		m.put(2, "Rakesh");
		m.put(3, "Dhiraj");
		System.out.println(m);
		Set s = m.keySet();
		
		Iterator it = s.iterator();
		Object key,value;
		while (it.hasNext()) {
			key=it.next();
			value=m.get(key);
			System.out.println(key+":::"+value);
		}
	}
}	

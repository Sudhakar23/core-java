package com.java.collection.myhashset;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyTreemap {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put("India", "new delhi");
		tm.put("Bangladesh", "Bhutan");
		tm.put("Nepal", "Kathmandu");
		tm.put("SriLanka", "Colombo");
		tm.put("Bhutan", "Thimpu");
		System.out.println(tm);
		Map map = tm.descendingMap();
		System.out.println(map);
	}
}

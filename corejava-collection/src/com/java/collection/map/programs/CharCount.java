package com.java.collection.map.programs;

import java.util.HashMap;

public class CharCount {
	public static void main(String[] args) {
		String r = "my name is ajay ajay";
		// String[] rc = r.split("");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < r.length(); i++) {
			String w = String.valueOf(r.charAt(i));
			if (hm.get(w) != null) {
				int x = hm.get(w);
				hm.put(w, ++x);
			} else
				hm.put(w, 1);
		}
		System.out.println("Values :" + hm);
	}
}
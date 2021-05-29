package com.java.scjpdump;

import java.util.HashMap;

public class CharCount {
	public static void main(String[] args) {
		String str = "my name is sudhakar";
		String[] strArr = str.split("");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < args.length; i++) {
			String w = String.valueOf(str.charAt(i));
			if (hm.get(w)!= null) {
				int x = hm.get(w);
				hm.put(w, ++x);
			} else
				hm.put(w, 1);
		}
		System.out.println("value: " + hm);
	}
}

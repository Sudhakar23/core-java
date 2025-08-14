package com.java.lambda;

import java.util.Collections;
import java.util.TreeMap;

public class TreeMapLambda_18 {
	public static void main(String[] args) {
//		TreeMap<Integer, String> map = new TreeMap();
//		TreeMap<Integer, String> map = new TreeMap(Collections.reverseOrder());
		TreeMap<Integer, String> map = new TreeMap<>((i2, i1)-> {return (i1 > i2)?-1:(i1 < i2)?1:0 ;});
		map.put(100, "abc");
		map.put(400, "def");
		map.put(200, "ghi");
		System.out.println(map);
	}
}

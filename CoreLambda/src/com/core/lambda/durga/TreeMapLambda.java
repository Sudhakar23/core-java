package com.core.lambda.durga;

import java.util.TreeMap;

public class TreeMapLambda {
	public static void main(String[] args) {
//		TreeMap<Integer, String> map = new TreeMap();
		TreeMap<Integer, String> map = new TreeMap<>((i1, i2)-> {return (i1>i2)?-1:(i1<i2)?1:0 ;});
		map.put(100, "abc");
		map.put(400, "def");
		map.put(200, "ghi");
		System.out.println(map);
	}
}

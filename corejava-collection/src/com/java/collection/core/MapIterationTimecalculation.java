package com.java.collection.core;

import java.util.*;
import java.util.Map.Entry;

public class MapIterationTimecalculation {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap();
		hashMap.put(1, "Moni");
		hashMap.put(2, "Sudhakar");
		hashMap.put(4, "Chandra");
		hashMap.put(5, "Babu");

		
		hashMap.put((int)(Math.random()*100),"s" );
		
		hashMap.forEach((k,v)->{System.out.println(k +" " +v);});
		
		
	}
}

package com.java.collection.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentMapExample {
	static Map<String, Long> orders = new ConcurrentHashMap<>();
	public static void main(String[] args) {
		orders.put("Mumbai", 0L);
		orders.put("Delhi", 0L);
		orders.put("Mumbai", 0L);
		orders.put("Mumbai", 0L);
		ExecutorService service = Executors.newFixedThreadPool(2);
	}
}

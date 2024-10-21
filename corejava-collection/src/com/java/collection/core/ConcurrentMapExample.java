package com.java.collection.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class ConcurrentMapExample {
	
	static Map<String, AtomicLong> orders = new ConcurrentHashMap<>();
	
	static void processOrders() {
		for (String  city : orders.keySet()) {
			for (int i = 0; i < 20; i++) {
				Long oldOrderCount = orders.get(city).getAndIncrement();
//				orders.put(city, oldOrderCount+1);
			}
			
		}
		AtomicLong aLong = new AtomicLong();
		System.out.println("aLong " +aLong);
		AtomicInteger aInt = new AtomicInteger();
		System.out.println("aInt " +aInt);
		AtomicBoolean aBoolean = new AtomicBoolean();
		System.out.println("aBoolean " +aBoolean);
	}
	
	public static void main(String[] args) throws InterruptedException {
		orders.put("Bangalore", new AtomicLong());
		orders.put("Delhi", new AtomicLong());
		orders.put("Chennai", new AtomicLong());
		orders.put("Kolkata", new AtomicLong());
		
		ExecutorService service = Executors.newFixedThreadPool(2);// ThreadPool of 2 tread
		service.submit(ConcurrentMapExample :: processOrders);
		service.submit(ConcurrentMapExample :: processOrders);
		
		service.awaitTermination(2, TimeUnit.SECONDS);
		service.shutdown();
		System.out.println(orders);
		
	}
}

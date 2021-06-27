package com.java.thread.jenkov;

import java.util.function.Consumer;

public class SynchronizedLamda {
	
	private static Object object = null;
	
	public static synchronized void setObject(Object object) {
		object = object;
	}
	
	public static void consumeObject(Consumer consumer) {
		consumer.accept(object);
	}
	
	public static void main(String[] args) {
		consumeObject((obj) -> {
			synchronized (SynchronizedLamda.class) {
				System.out.println(obj);
			}
		});
		
		consumeObject((obj) -> {
			synchronized(String.class) {// String.class does not make any sense. 
				System.out.println(obj);
			}
		});
	}
}

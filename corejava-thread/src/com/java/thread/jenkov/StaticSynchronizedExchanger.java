package com.java.thread.jenkov;

public class StaticSynchronizedExchanger {

	protected static Object object = null;
	
	public static synchronized void setObject(Object o) {
		object = o;
	}
	
	public synchronized Object getObject() {
		return object;
	}
	
	public static void setObj(Object o) {
		synchronized(StaticSynchronizedExchanger.class){
			object = o;
		}
	}
	
	public static Object getObj() {
		synchronized(StaticSynchronizedExchanger.class) {
			return object;
		}
	}
}

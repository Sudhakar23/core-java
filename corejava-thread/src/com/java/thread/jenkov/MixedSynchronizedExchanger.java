package com.java.thread.jenkov;

/**
 * 
 *
 */
public class MixedSynchronizedExchanger {
	
	protected static Object staticObject = null;

	protected Object instanceObject = null;

	public static synchronized void setStaticObject(Object obj) {
		staticObject = obj;
	}

	public synchronized void setInstanceObject(Object obj) {
		this.instanceObject = obj;
	}

}

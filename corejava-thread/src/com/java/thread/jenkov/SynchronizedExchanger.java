package com.java.thread.jenkov;

public class SynchronizedExchanger {
	protected Object object = null;
	
	public synchronized void setObject(Object o) {
		this.object = o;
	}
	
	public synchronized Object getObject() {
		return object;
	}
	
	public void setObj(Object o) {
		synchronized(this){
			this.object = o;
		}
	}
	
	public Object getObj() {
		synchronized(this) {
			return object;
		}
	}
}

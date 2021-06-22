package com.java.thread.jenkov;

public class Exchanger {

	private Object object = null;
	private volatile boolean hasNewObject = false;
	
	public void setObject(Object obj) {
		this.object = obj;
		hasNewObject = true;
	}
	
	public Object getObject() {
		
		while(!this.hasNewObject) {
			//busy wait
		}
		
		Object returnObject = object;
		hasNewObject = false;
		return returnObject;
	}

}

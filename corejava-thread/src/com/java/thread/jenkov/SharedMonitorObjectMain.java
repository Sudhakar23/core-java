package com.java.thread.jenkov;

public class SharedMonitorObjectMain {

	public static void main(String[] args) {
		Object monitor1 = new Object();

		SharedMonitorObject smo1 = new SharedMonitorObject(monitor1);
		SharedMonitorObject smo2 = new SharedMonitorObject(monitor1);
		
		//they will block each other smo1 and smo2, since they are working in same monitor object.
		smo1.incCounter();
		smo2.incCounter();
		
		Object monitor2 = new Object();

		SharedMonitorObject smo3 = new SharedMonitorObject(monitor2);
		//This will not block other threads calling intCounter in smo1 and smo2, 
		//bcoz smo3 is using different monitor object.
		smo3.incCounter();

	}

}

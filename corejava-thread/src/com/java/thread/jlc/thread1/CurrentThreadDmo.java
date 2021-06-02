package com.java.thread.jlc.thread1;

//Controlling the main Thread.

/**
 * @author jlcindia
 *
 */
class CurrentThreadDemo{
	public static void main(String[] arg)  {
		Object o;
		double d = Double.MAX_VALUE;
		double d2 = 3343432434343434324d;
   System.out.println("Main in test");
   System.out.println(d);
    }
}

class  Test {
	/**
	 * 
	 */
	public static void m1(){
		String[] str = null; 
		//main(str);
	}
	
	public static void main(String[] yfy) {
		Thread t = Thread.currentThread();
		System.out.println("Current thread : " + t);
	//	change the name of the thread
		t.setName("My...Thread");
		System.out.println("After name change: " + t);
	/*		try {
				for(int n = 5; n > 0; n--) {	
					System.out.println(n);
					System.out.println("After name change: " + t);
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				System.out.println("Main thread interrupted");
			}
			System.out.println("Main thread completes it execution ");
	
	}*/
	}
}


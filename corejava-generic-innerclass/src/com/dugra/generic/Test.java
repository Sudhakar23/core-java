package com.dugra.generic;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Test0<Integer> t = new Test0();
		ArrayList<Integer> it = null;
		m1(it);
	}
	public static void m1(ArrayList<? extends Number> al){
		System.out.println("Gen teet");
	}
	
	public static void m2(ArrayList<? extends X> al){
		System.out.println("Gen teet");
	}
	
	public static void m3(ArrayList<? super X> al){
		System.out.println("Gen teet");
	}
	
}

// only extends keyword allowed

class Test0<T extends Number>{
	public static void m1(){
		System.out.println("Gen teet");
	}
}
class Test1<T extends Number & Runnable>{
	
}
/*class Test2<T extends Runnable & Number>{ // class first then Interface 
	
}
class Test3<T extends Number & Thread>{ // Thread is not a thread it cannot be specified as boundes type 
	
}*/
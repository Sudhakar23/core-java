package com.complete.reference;

class Hello {
	Hello h;
	Hello(){}
	Hello(Hello h){
		this.h = h;
	}
}
class Gen<T> {
	T ob; 
	Gen(T o) {
		ob = o;
	}
	T getob() {
		return ob;
	}
	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}

class GenericTest1 {
	public static void main(String args[]) {
//		Gen<Double> iOb = new Gen<Double>(88.0);
		Gen<Integer> iOb;
		// Create a Gen<Integer> object and assign its
		// reference to iOb. Notice the use of autoboxing
		// to encapsulate the value 88 within an Integer object.
		iOb = new Gen<Integer>(88);
		iOb.showType();
		double v = iOb.getob();
		System.out.println("value: " + v);
		System.out.println();
		
		Gen<String> strOb = new Gen<String>("Generics Test");
		strOb.showType();
		String str = strOb.getob();
		System.out.println("value: " + str);

//		Hello h1 = new Hello();
//		Gen<Hello> hello = new Gen<>(h1);
//		hello.showType();
		String str1 = (String) strOb.getob();
		System.out.println("value: " + str1);
//		iOb = strOb;
		v = (Integer) iOb.getob(); 
		
	}
}
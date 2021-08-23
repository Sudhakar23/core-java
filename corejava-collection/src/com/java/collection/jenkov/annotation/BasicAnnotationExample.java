package com.java.collection.jenkov.annotation;



//@MyAnnotation   // values not required since elements have default value
// error since annotation is restricted to use only on methods
public class BasicAnnotationExample {
	
//	@MyAnnotation(name = "java")
	private static String name ; 
	
	@MyAnnotation(name = "java")
	public static void main(String[] args) {
		System.out.println(name);
	}
	
	
	
}

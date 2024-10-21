package com.java.collection.jenkov.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// @interface declares it as annotation

//To restrict annotation to use in specific area of class
@Target(ElementType.METHOD)
public @interface MyAnnotation {
	
	//property of annotaion also known as element.
	String name() default "language";
	
	int count() default 1000;
	
	// Property as array  
	String[] tags() default {};
}

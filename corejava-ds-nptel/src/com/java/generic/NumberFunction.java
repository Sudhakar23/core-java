package com.java.generic;

public class NumberFunction<T extends Number> {
	T obj;

	NumberFunction(T obj){
		// Note: Generic type cannot be allowed for array instantiate.
		// T t[] = new T[5];
		T t[] ;
		this.obj = obj;
	}
	
	double square() {
		return obj.intValue() * obj.intValue();
	}
}

package com.java.design.singleton;

final class SingletonObjectDemo implements Cloneable {
	private static SingletonObjectDemo singletonObject;
	// Note that the constructor is private
	private SingletonObjectDemo() {
		// Optional Code
	}
	public static synchronized SingletonObjectDemo getSingletonObject() {
		if (singletonObject == null) {
			singletonObject = new SingletonObjectDemo();
		}
		return singletonObject;
	}
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}

public class CompleteSinglton {
	public static void main(String[] args) throws Exception {
		SingletonObjectDemo single = null;
		SingletonObjectDemo single1 = null;
		single = SingletonObjectDemo.getSingletonObject();
		single1 = SingletonObjectDemo.getSingletonObject();
		System.out.println(single.hashCode() == single1.hashCode());
		SingletonObjectDemo clonedObject = (SingletonObjectDemo) single.clone();
		System.out.println(single.hashCode() == clonedObject.hashCode());
	}
}

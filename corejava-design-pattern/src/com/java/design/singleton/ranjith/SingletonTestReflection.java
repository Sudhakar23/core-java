package com.java.design.singleton.ranjith;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTestReflection {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		//Reflection
		
		 Class c1 = Class.forName("java.lang.Integer");
		 
	        System.out.print("Class represented by c1: "
	                         + c1.toString());
		
		
		Class clazz = Class.forName("com.java.design.singleton.ranjith.Singleton");
		Constructor<Singleton>[] singleRef =  clazz.getConstructors();
		singleRef[0].setAccessible(true); // changing private constructor to public constructor
		Singleton sing = singleRef[0].newInstance();
		System.out.println(sing.getSingleton().hashCode());
		System.out.println(String.valueOf((s1.hashCode())).equals(String.valueOf((s2.hashCode()))));
	}
}

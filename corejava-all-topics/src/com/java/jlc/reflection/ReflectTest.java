package com.java.jlc.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class A1 {
	public int a ;
	int b ;
	private float f = 4f;
	
	private void m() {
	}
	void m1() {
	}
	void m2() {
	}
}

public class ReflectTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("com.jlc.reflection.A1");
		Method m[] = c.getDeclaredMethods();
		for (Method m1 : m) {
			System.out.println(m1.getModifiers()+":"+ m1.getReturnType()+":"+ m1.getName());
		}		
	}
}
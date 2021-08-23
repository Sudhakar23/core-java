package com.java.design.singleton.ranjith;

import java.io.Serializable;

public class Singleton implements Serializable{
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	public static Singleton getSingleton() {
		return singleton;
	}
	
	
}
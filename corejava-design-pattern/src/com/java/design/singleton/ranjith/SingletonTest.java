package com.java.design.singleton.ranjith;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		
		System.out.println((s1.hashCode()));
		System.out.println((s2.hashCode()));
		
		System.out.println(String.valueOf((s1.hashCode())).equals(String.valueOf((s2.hashCode()))));
	}
}

package com.java.core;
class Singleton{
	private static Singleton sign= null;
	static{
		sign = new Singleton();
	}
	private Singleton() {
	}
	public static Singleton mySingleton(){
		return sign;
	}
}
public class DoubleDimension {
	public static void main(String[] args){
		
		Singleton sign1 = Singleton.mySingleton();
		Singleton sign2 = Singleton.mySingleton();
		Singleton sign3 = Singleton.mySingleton();
		
		System.out.println(sign1.hashCode());
		System.out.println(sign2.hashCode());
		System.out.println(sign3.hashCode());
	}
}
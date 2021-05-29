package com.java.generic;

public class GenericTest {
	public static void main(String[] args) {
		GenericTest g = new GenericTest();
		g.genericPrint(101);
		g.genericPrint("asdf");
		
		
	}
	public <T> void genericPrint(T t){
		System.out.println(t.getClass() +" ::" +t.getClass().getName() + " " +t) ;
	} 
	
	<T> void gTest(T t) {
		System.out.println(t);
	}
}

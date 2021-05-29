package com.oops;

import java.util.*;

class A { 
	public A(){
		System.out.println("A");
	}
}
abstract class B extends A{
	public B(int a){
		System.out.println("B");
	}
}
class C extends B{
	public C(){
		super(11);
		System.out.println("c");
	}
}
public class OOPSTest {
	public OOPSTest(){
		System.out.println("oops");
	}
	public static void main(String[] args) {
		C c = new C();
		ArrayList al = new ArrayList();
		al.add("Rupsi");
		al.add("ispuR");
		al.add("Kumari");
		
		System.out.println(al);
		Object obj[] = new Object[al.size()];
		for(int i = 0 ; i< al.size();i++){
			obj[i] = al.get(i);
		}
		for (Object object : obj) {
			System.out.println(object);
		}
		
	}
}

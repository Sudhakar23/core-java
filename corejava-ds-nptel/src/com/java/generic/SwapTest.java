package com.java.generic;

public class SwapTest {

	public static <T> void swap(T x, T y) {
		T t; 
		t = x;
		x = y;
		y = t;		
	}
	
	public static void swapT(Integer x, Integer y) {
		Integer t; 
		t = x;
		x = y;
		y = t;
	}
	
	public static void stringManipulation(String str) {
		String s = str;

	}
	
	
	public static void main(String[] args) {
		Integer a = new Integer(10);
		Integer b = new Integer(20);
		
		swapT(a, b);
		//System.out.println(a +" " +b);
		
		Test t = new Test(10, "Sudhakar");
		System.out.println(t.getA());
		change(t);
		System.out.println(t.getA());
	}
	
	public static void change(Test t) {
		int tempA = t.getA();
		t.setA(++tempA);
	}

}

class Test{
	private String name; 
	private int a ;
	Test(){
		a = 0;
	}
	Test(int a, String str ){
		this.a = a;
		this.name = str;
	}

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
}

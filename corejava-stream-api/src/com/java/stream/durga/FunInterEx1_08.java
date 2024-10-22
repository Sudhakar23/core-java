package com.java.stream.durga;

//@FunctionalInterface
interface Interf {
	public int add(int a, int b);
	public default void mul(int a, int b) {};
}
public class FunInterEx1_08{
	public static void main(String[] args) {
		//With Lambda expression
		Interf interf = (a, b)-> a+b;
		System.out.println(interf.add(12, 34));
		interf.add(12, 5);
		
		//Without Lambda expression 
		Interf interf2 = new Interf() {
			@Override
			public int add(int a, int b) {
				System.out.println("Sum :" + (a+b));
				return a+b;
			}
		};
		interf2.add(22, 33);
	}
}

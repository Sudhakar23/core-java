package com.core.lambda.durga;

//@FunctionalInterface
interface Interf {
	public void add(int a, int b);
	public default void mul(int a, int b) {};
}
public class FunInterEx1_08{
	public static void main(String[] args) {
		Interf interf = (a, b)-> System.out.println("Sum :" +(a+b));
		interf.add(12, 34);
		interf.add(12, 5);
		
		Interf interf2 = new Interf() {
			@Override
			public void add(int a, int b) {
				System.out.println("Sum :" + (a+b));
				
			}
			public void mul() {
				
			}
		};
		interf2.add(22, 33);
	}
}

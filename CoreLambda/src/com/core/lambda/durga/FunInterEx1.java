package com.core.lambda.durga;

interface Interf {
	public void add(int a, int b);
	public default void mul(int a, int b) {};
}
public class FunInterEx1{
	public static void main(String[] args) {
		Interf interf = (a, b)-> System.out.println("Sum :" +(a+b));
		interf.add(12, 34);
		interf.add(12, 5);
	}
}

package com.core.lambda.durga;

interface Interface1{
	public int squareIt(int a);
}

public class TestSquare_09 {

	public static void main(String[] args) {
		//Without using functional interface
		Interface1 intfr = new Interface1() {
			public int squareIt(int a) {
				return a*a;
			};
		};
		System.out.println(intfr.squareIt(3));
		
		//Using lambda expression
		Interface1 intfrL = (a) -> a*a;
		System.out.println(intfrL.squareIt(5));
	}
}
package com.java.lambda;

interface Calc {
	public int operation(int i, int j);
}

public class LambdaExp {

	public static void main(String[] args) {
		int doSomeCalc = LambdaExp.doCalc(5, 3, (i, j) -> i/j );
		System.out.println(doSomeCalc);
		
		int doSomeCalc1 = LambdaExp.doCalc(5, 3, (i, j) -> i+j );
		System.out.println(doSomeCalc1);
		
		int doSomeCalc11 = LambdaExp.doCalc(5, 3, new Calc() {
			@Override
			public int operation(int i, int j) {
				// TODO Auto-generated method stub
				return i +j;
			}
		} );
		System.out.println(doSomeCalc11);
		
		
		int doSomeCalc2 = LambdaExp.doCalc(5, 3, (i, j) -> i-j );
		System.out.println(doSomeCalc2);
	}

	public static int doCalc(int i, int j, Calc calc) {

		return calc.operation(i, j);
	}

}

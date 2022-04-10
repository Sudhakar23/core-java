package com.core.lambda;

interface Calc {
	public int operation(int i, int j);
}

public class LambdaExpAsFunctionProgram {

	public static void main(String[] args) {
		int doSomeCalc = LambdaExpAsFunctionProgram.doCalc(5, 3, (i, j) -> i/j );
		System.out.println(doSomeCalc);
	}

	public static int doCalc(int i, int j, Calc calc) {

		return calc.operation(i, j);
	}

}

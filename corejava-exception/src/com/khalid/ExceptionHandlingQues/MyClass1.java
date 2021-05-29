package com.khalid.ExceptionHandlingQues;

class MyClass {
	void f() throws ArithmeticException, InterruptedException {
		div(5, 5);
	}

	int div(int i, int j) throws ArithmeticException {
		return i / j;
	}
}

public class MyClass1 extends MyClass {
	void f() {
		try {
			div(5, 0);
		} catch (ArithmeticException e) {
			return;
		}
		throw new RuntimeException("ArithmeticException");
	}
}

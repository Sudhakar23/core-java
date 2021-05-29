package com.Exception;

class T {
	class TestException extends Exception {
	}

	public void runTest() throws TestException {
	}

	public void test() throws Exception /* Point X */
	{
		runTest();
	}
}

public class ExceptionTest {
	public static void main(String[] args) {
	}
}
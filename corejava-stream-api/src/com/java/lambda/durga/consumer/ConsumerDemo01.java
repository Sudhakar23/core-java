package com.java.lambda.durga.consumer;

import java.util.function.Consumer;

public class ConsumerDemo01 {
	public static void main(String[] args) {
		String s = "lambda";
		int i = 0;
		Consumer<String> cons = str -> str.length();
		cons.accept("asdfs");

	}
}

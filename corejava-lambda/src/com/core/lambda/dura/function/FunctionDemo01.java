package com.core.lambda.dura.function;

import java.util.function.Function;

//Find length of given string.
public class FunctionDemo01 {
	
	public static void main(String[] args) {
//		String str = "java";
		Function<String, Integer> funStrLen = (str) -> str.length(); 
		System.out.println(funStrLen.apply("java"));
	}
}

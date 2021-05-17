package com.core.lambda.durga.function;

import java.util.function.Function;

public class FunctionChainingDemo01 {
	public static void main(String[] args) {
		
		String strTest = "aishabhi";
		Function<String, String> funToUppper = str -> str.toUpperCase();
//		System.out.println(funToUppper.apply(strTest));
		Function<String, String> funSub = str -> str.substring(0, 4);
//		System.out.println(funSub.apply(strTest));
		System.out.println(funToUppper.andThen(funSub).apply(strTest));
		System.out.println(funToUppper.compose((funSub)).apply(strTest));
		System.out.println(strTest);
		
		
		Function <String, String> fn = Function.identity();
		String s = fn.apply("durga");
		System.out.println(s);
		
	}
}
 
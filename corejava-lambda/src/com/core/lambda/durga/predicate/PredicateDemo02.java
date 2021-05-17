package com.core.lambda.durga.predicate;

import java.util.function.Predicate;

public class PredicateDemo02 {
	public static void main(String[] args) {
		Predicate<String> p = str -> str.length() > 5;
		System.out.println(p.test("java"));
		System.out.println(p.test("python"));
	}
}

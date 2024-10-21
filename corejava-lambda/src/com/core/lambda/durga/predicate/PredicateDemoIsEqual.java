package com.core.lambda.durga.predicate;

import java.util.function.Predicate;

public class PredicateDemoIsEqual {
	public static void main(String[] args) {
		Predicate<String> strPre = Predicate.isEqual("hello");
		System.out.println(strPre.test("Hello"));
	}
}

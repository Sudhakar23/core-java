package com.java.lambda.durga.predicate;

import java.util.function.Predicate;

//Predicate joining demo
public class PredicateJoiningDemo {
	public static void main(String[] args) {
		int[] x = {12,10,23,33,42,11,6,7,9};
		Predicate<Integer> preEven = num -> num % 2 == 0;
		Predicate<Integer> preGreater = num -> num > 20;
//		System.out.println(pre.test(21));
		m1(preEven, x);
		m1(preGreater, x);
		Predicate preJoinAnd = preEven.and(preGreater);
		m1(preJoinAnd, x);
		Predicate preJoinOr = preEven.or(preGreater);
		m1(preJoinOr, x);		
		Predicate preNegate = preEven.negate();
		m1(preNegate, x);
		
	}
	public static void m1(Predicate<Integer> pre, int[] x) {
		for(int x1 : x) {
			if(pre.test(x1))
				System.out.print(x1 +",");
		}
		System.out.println("");
	}
}

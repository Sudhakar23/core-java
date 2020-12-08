package com.core.lambda.durga;

import java.util.function.Predicate;

public class PredicateDemo01{

	public static void main(String[] args) {
		Predicate<Integer> p = (t) -> { return t%2==0 ? true : false;};
		System.out.println(p.test(4));
	}
}

// Without using Lambda expression

//public class PredicateDemo01 implements Predicate<Integer>{
//	@Override
//	public boolean test(Integer t) {
//		return t%2==0 ? true : false;
//	}
//	
//	public static void main(String[] args) {
//		PredicateDemo01 pd = new PredicateDemo01();
//		System.out.println(pd.test(3));
//	}
//}

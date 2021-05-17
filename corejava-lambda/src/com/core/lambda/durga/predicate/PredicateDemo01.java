package com.core.lambda.durga.predicate;

import java.util.function.Predicate;

public class PredicateDemo01{

	public static void main(String[] args) {
//		Predicate<Integer> p = (t) -> t%2==0 ? true : false ;
//		Predicate<Integer> p = t -> t%2==0 ? true : false ;
		Predicate<Integer> p = t -> t%2==0;
		System.out.println(p.test(3));
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

package com.java.collections.scjp;

import java.util.ArrayList;
import java.util.List;

public class Selftest7 {
	public static void main(String[] args) {
		ArrayList<Integer>input=null;
		List<Integer> output=null;
		output=process(input);
		
	}
public static<E extends Number>List<E>process(List<E>  nums){
	return new ArrayList<E>();
}
}

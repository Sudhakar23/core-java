package com.ocp.javase21.ch08.lambda;

import java.util.TreeSet;

public class Exercise23 {
	public static void main(String[] args) {
		var fishes = new TreeSet<String>();
//		fishes.addFirst("clown");
		fishes.add("Koi");
		fishes.add("carp");
		fishes.add("sardine");
		
		for (String string : fishes) {
			System.out.println(string);
		}
		
		fishes.forEach(fish -> System.out.println(fish));
	}
}

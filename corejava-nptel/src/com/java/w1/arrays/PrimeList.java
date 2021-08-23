package com.java.w1.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class PrimeList {
	public static void main(String[] args) {
		Map<Integer, Set<Integer>> map = new HashMap();
		for(int i = 1; i < 100; i = i+1) {
			int count = 0;
			Set<Integer> set = new TreeSet();
//			System.out.print(i +" ");
			for(int j = 2 ; j<i; j++) {
				if( i % j == 0) {
					count++;
					set.add(j);
				}
			}
			if(count > 0) {
//				System.out.println(" Not Prime");
				map.put(i, set);
				System.out.println(i+"    Divisible by " +set);
			}
			else {
				System.out.println(i +" IS PRIME = = = = =  ");
//				System.out.println("    Divisible by none. ");
			}
		}
		System.out.println(map);
	}
}
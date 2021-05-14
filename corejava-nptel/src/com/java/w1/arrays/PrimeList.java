package com.java.w1.arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrimeList {
	public static void main(String[] args) {
		for(int i = 1; i < 100000; i = i+2) {
			int count = 0;
//			System.out.print(i +" ");
//			Set<Integer> set = new TreeSet();
			for(int j = 2 ; j<i; j++) {
				if( i % j == 0) {
					count++;
//					set.add(j);
				}
			}
			if(count > 0) {
//				System.out.println(" Not Prime");
//				System.out.println("    Divisible by " +set);
			}
			else {
				System.out.println(i +" IS PRIME = = = = =  ");
//				System.out.println("    Divisible by none. ");
			}
		}
	}
}
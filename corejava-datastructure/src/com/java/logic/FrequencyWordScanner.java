package com.java.logic;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.*;

public class FrequencyWordScanner {
	public static void main(String[] args) {
		// String str="this is a java we r typing java";
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		// System.out.println(str);

		List<String> list = Arrays.asList(str.split(" "));
		System.out.println(list);
		Set<String> set = new HashSet<String>(list);
		for(String st : set){
			System.out.println(st +":"+Collections.frequency(list, st));
		}
//		Set<String> set = new HashSet<String>(list);
//
//		for (String st : set) {
//			System.out.println(st + ":" + Collections.frequency(list, st));
//		}
	}
}

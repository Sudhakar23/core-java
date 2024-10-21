package com.java.collections.scjp;

import java.util.ArrayList;
import java.util.List;

public class Selftest1 {
	
public static void main(String[] args) {
	List<List<Integer>> table=new ArrayList<List<Integer>>();
	for (int i = 0; i <=10; i++) {
		List<Integer> row=new ArrayList<Integer>();
		for (int j = 0; j <=10; j++) {
			row.add(i*j);
			table.add(row);
		}
		for (List<Integer> row1 : table) {
			System.out.println(row1);
			//System.out.println(row);
		}
	}
}
}

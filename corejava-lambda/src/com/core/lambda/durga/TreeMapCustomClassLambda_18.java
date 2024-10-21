package com.core.lambda.durga;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapCustomClassLambda_18 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(2, "Two");
		Employee emp2 = new Employee(4, "Four");
		Employee emp3 = new Employee(1, "One");
		Employee emp4 = new Employee(3, "Three");
		
		TreeMap<Integer, String> tMap = new TreeMap<>((i1, i2) -> (i1>i2) ? -1 : (i1<i2)?1 : 0 );
		tMap.put(1, "One");
		tMap.put(4, "Four");
		tMap.put(2, "Two");
		tMap.put(3, "Three");
		
		System.out.println(tMap);
		
//		Collections.sort(tMap, new CustomeComparator());
		
	}
}

class CustomeComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return e1.getEmpno() > e2.getEmpno() ? -1 : e1.getEmpno() < e2.getEmpno() ? 1 : 0;
	}
	
}


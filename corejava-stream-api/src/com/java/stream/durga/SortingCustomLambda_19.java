package com.java.stream.durga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortingCustomLambda_19 {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap  = new HashMap<>(5, 0.75f);
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(3, "Suresh"));
		empList.add(new Employee(2, "Rakesh"));
		empList.add(new Employee(4, "Dileep"));
		empList.add(new Employee(1, "AJay"));
//		Collections.sort(empList,  (e1, e2) ->{ return (e1.empno > e2.empno)?1 : (e1.empno < e2.empno)?-1:0;});
//		Collections.sort(empList,  (e1, e2) ->{ return (Map.Entry.getName > e2.empno)? -1 : (e1.empno < e2.empno)? 1 : 0;});
		hashMap.put(3, "Suresh");
		hashMap.put(2, "Rakesh");
		hashMap.put(4, "Dileep");
		hashMap.put(1, "AJay");
		System.out.println(hashMap);
		for(Set<Map.Entry<Integer, String>> map : hashMap.entrySet()) {
			
		}
		
		
		
//		for(Map.Entry<K, V> list : empList.get) {
//			
//		}
	}
}



class Employee{
	private int empno;
	private String name;
	public Employee(int empno, String name) {
		super();
		this.empno = empno;
		this.name = name;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

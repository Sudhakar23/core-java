package com.core.lambda.durga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCustomLambda {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>(  );
		empList.add(new Employee(3, "Suresh"));
		empList.add(new Employee(2, "Rakesh"));
		empList.add(new Employee(4, "Dileep"));
		System.out.println(empList);
		Collections.sort(empList,  ( e1,  e2) ->{ return (e1.empno>e2.empno)?1 : (e1.empno<e2.empno)?-1:0;});
		System.out.println(empList);
	}
}
class Employee{
	int empno;
	String name;
	public Employee(int empno, String name) {
		this.empno = empno;
		this.name = name;
	}
	
	public String toString() {
		return empno +":" +name;
	}
}

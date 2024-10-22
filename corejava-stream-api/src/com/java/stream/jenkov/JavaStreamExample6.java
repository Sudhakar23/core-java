package com.java.stream.jenkov;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamExample6 {
	
	public static void main(String[] args) {
		List<Employee> list = new ArrayList();
		list.add(new Employee("1000"));
		list.add(new Employee("2000"));
		list.add(new Employee("3000"));
		list.add(new Employee("4000"));
		
		// Converting salary to int and getting the sum.
		Integer sum = list.stream()							
			.map((Employee emp) -> emp.salary) 	
			.map(Integer::parseInt)
			.reduce((tempSum, value) -> empSum + value);
	}

}

class Employee{
	public String salary;
	public Employee(String salary) {
		this.salary = salary;
	}
}

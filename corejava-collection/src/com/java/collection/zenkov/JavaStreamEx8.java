package com.java.collection.zenkov;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamEx8 {
	
	public static class Employee{
		String salary;
		public Employee(String salary) {
			this.salary = salary;
		}	
	}
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("1000"));
		employees.add(new Employee("2000"));
		employees.add(new Employee("3000"));
		
		int sum = 
				employees.stream()
				.map(employee -> employee.salary)
				.map(Integer::parseInt)
				.reduce(0, (tempSum, value) -> tempSum + value);
		System.out.println("Total sal " + sum);
	}
}

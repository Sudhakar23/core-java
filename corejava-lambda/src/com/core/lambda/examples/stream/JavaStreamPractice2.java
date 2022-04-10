package com.core.lambda.examples.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;


	/*  1. Program to write emp details working in each dept
		2. Program to write emp count wroking in each dept
		3. Program to write active and inactive emp in the collections 
		4. Program to write min/max salary from the collection 
		5. Program to write max salary from each dept  */

public class JavaStreamPractice2 {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
				new Employee("001", "Nitish", 	"Sales","14000", "active"),
				new Employee("002", "Amit", 	"Mgmt",	"25000", "inactive"),
				new Employee("003", "Ravi", 	"IT", 	"25000", "active"),
				new Employee("004", "Suresh", 	"IT", 	"25000", "active"),
				new Employee("005", "Rakesh", 	"IT", 	"25000", "inactive"),
				new Employee("006", "Venkat", 	"HR", 	"15000", "active"),
				new Employee("007", "Sumit", 	"HR", 	"19000", "active"),
				new Employee("008", "Naveen", 	"IT", 	"22000", "active")
		);
				

		// 1 Employee details working in each department
	  //Map<String, List<Employee>> employeeByEmpId = employees.stream().collect(Collectors.groupingBy(emp -> emp.getEmpId(), Collectors.toList()));
		Map<String, List<Employee>> employeeByEmpId = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.toList()));
		
		/*
		 * for(Map.Entry<String, List<Employee>> employee: employeeByEmpId.entrySet()) {
		 * System.out.println(employee.getKey() +"::::" +employee.getValue()); }
		 */
		employeeByEmpId.entrySet().forEach(emp -> {
			System.out.println(emp.getKey() +"::" +emp.getValue());
		});
		
		// 2 Employee count dept wise
		Map<String, Long> empCount = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
		empCount.entrySet().forEach(emp -> System.out.println(emp.getKey() +"::" +emp.getValue()));
		
		
		//3 active and inactive Employee
		long count = employees.stream().filter(emp -> emp.getStatus().equals("active")).count();
		System.out.println(count);
		
		
		//4 min/max salary of Employee
		Optional<Employee> max = employees.stream().max(Comparator.comparing(Employee::getSal));
		System.out.println(max.get().getSal());

		Optional<Employee> min = employees.stream().min(Comparator.comparing(Employee::getSal));
		System.out.println(min.get().getSal());
		
		
		//5. Program to write max salary from each dept
		//   Groupby --> Dept apply filter 
		Map<String, Optional<Employee>> maxSal = 
				employees.stream().
				collect(Collectors.groupingBy(Employee::getDept, Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSal)))));
		
		maxSal.entrySet().forEach(employee -> System.out.println(employee.getKey() +":"+employee.getValue()));
		System.out.println("*******");
		maxSal.entrySet().forEach(System.out::println);
		
		
		//6 nth highest sal
		Optional<String> findFirst = employees.stream()
		.map(e -> e.getSal())
		.sorted(Comparator.reverseOrder()).skip(2).findFirst();
		System.out.println(findFirst.get());
	
		//Getting second highest
		List<Integer> numbers = Arrays.asList(6,1,8,23,4,34, 56, 21,1,98,2);
		Optional<Integer> findNth = numbers.stream().sorted((x,y) -> y.compareTo(x)).skip(1).findFirst();
		Optional<Integer> findNth2 = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(findNth.get());
		
		//Finding duplicate items 
		List<Integer> num = Arrays.asList(2,2,4,5,5,6,6,7,8,9);
		Set<Integer> setNum = new HashSet();
		List<Integer> collect = num.stream().filter(n -> setNum.add(n) == false ).collect(Collectors.toList());
		collect.forEach(n -> System.out.println(n));

	}
	
	

}



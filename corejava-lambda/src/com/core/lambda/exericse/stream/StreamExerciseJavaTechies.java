package com.core.lambda.exericse.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExerciseJavaTechies {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("001", "Nitish", 25, "Male", "Mgmt", "24000", "active", 2014),
				new Employee("002", "Amit", 25, "Male", "Sales", "20000", "active", 2014),
				new Employee("003", "Diya", 22, "Female", "HR", "14000", "active", 2017),
				new Employee("004", "Suresh", 24, "Male", "Mgmt", "25000", "active", 2010),
				new Employee("005", "Venkat", 20, "Male", "IT", "25000", "active", 2018),
				new Employee("006", "Sumit", 19, "Male", "IT", "18000", "active", 2019),
				new Employee("007", "Naveen", 18, "Male", "IT", "17500", "active", 2018),
				new Employee("008", "Abhishek", 18, "Male", "IT", "14000", "active", 2020),
				new Employee("009", "Kiran", 19, "Female", "HR", "16000", "active", 2014)
		);
		
		//Gender count
		Map<String, Long> genderCount = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(genderCount);
		
		//Print name of all dept
		List<String> collect = employees.stream().map(Employee::getDept).distinct().collect(Collectors.toList());
		System.out.println(collect);
		
		
		//Average age of male and female employee
		employees.stream().map(emp -> emp.getGender());
		
		//Details of highest paid employee
		
		//All emp joined after 2016
		List<Employee> collect3 = employees.stream().filter(emp -> emp.getYearOfJoining() > 2018).collect(Collectors.toList());
		System.out.println(collect3);
		
		//Count no of emp in each dept
		Map<String, Long> collect2 = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
		System.out.println(collect2);
	}

}

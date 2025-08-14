package com.java.stream.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java.stream.beans.Employee;

public class Test {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("001", "Nitish", 	29, "Male", 	"HR", 					"24000", "active", 2014),
				new Employee("002", "Amit", 	29, "Male", 	"Sales & Mkt",			"20000", "active", 2014),
				new Employee("003", "Diya", 	22, "Female", 	"HR", 					"14000", "active", 2017),
				new Employee("005", "Venkat", 	20, "Male", 	"Product Development", 	"25000", "active", 2018),
				new Employee("004", "Suresh",	24, "Male", 	"Infrastructure",	 	"25000", "active", 2010),
				new Employee("006", "Sumit", 	19, "Male", 	"Account & Finance", 	"18000", "active", 2019),
				new Employee("007", "Naveen", 	18, "Male", 	"Product Development", 	"17500", "active", 2018),
				new Employee("008", "Abhishek", 28, "Male", 	"Product Development", 	"14000", "active", 2020),
				new Employee("009", "Kiran", 	19, "Female", 	"Infrastructure", 		"16000", "active", 2014),
				new Employee("002", "Kanak", 	25, "Female", 	"Sales & Mkt",			"20000", "active", 2014)
		);
		
		
//		Employee empBuild = new EmployeeBuilder().setName("Rakesh").setDept("IT").setSal("1234").build();
		
		Stream<String> mapStream = employees.stream().map(emp -> emp.getName());
		
		mapStream.forEach(emp -> System.out.println(emp));
		
		
	}
}

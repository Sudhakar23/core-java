package com.core.lambda.exericse.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
				new Employee("001", "Nitish", "Sales", "14000", "active"),
				new Employee("002", "Amit", "Mgmt", "25000", "inactive"),
				new Employee("003", "Ravi", "IT", "25000", "active"),
				new Employee("004", "Suresh", "IT", "25000", "active"),
				new Employee("005", "Rakesh", "IT", "25000", "inactive"),
				new Employee("006", "Venkat", "HR", "15000", "active"),
				new Employee("007", "Sumit", "HR", "19000", "active"),
				new Employee("008", "Naveen", "IT", "22000", "active")
		);
				

		// 1
		
	  //Map<String, List<Employee>> employeeByEmpId = employees.stream().collect(Collectors.groupingBy(emp -> emp.getEmpId(), Collectors.toList()));
		Map<String, List<Employee>> employeeByEmpId = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.toList()));
		
		/*
		 * for(Map.Entry<String, List<Employee>> employee: employeeByEmpId.entrySet()) {
		 * System.out.println(employee.getKey() +"::::" +employee.getValue()); }
		 */
		employeeByEmpId.entrySet().forEach(emp -> {
			System.out.println(emp.getKey() +"::" +emp.getValue());
		});
		
		// 2 emp count dept wise
		Map<String, Long> empCount = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
		empCount.entrySet().forEach(emp -> System.out.println(emp.getKey() +"::" +emp.getValue()));
		
		//3 active and inactive emp
		long count = employees.stream().filter(emp -> emp.getStatus().equals("active")).count();
		System.out.println(count);
		
		//4 min/max salary
		
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
	}
	
	

}

class Employee{
	private String empId;
	private String name;
	private String dept;
	private String sal;
	private String status;
	
	Employee(){}

	
	public Employee(String empId, String name, String dept, String sal, String status) {
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
		this.status = status;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	public String isStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


	public String getEmpId() {
		return empId;
	}


	public void setEmpId(String empId) {
		this.empId = empId;
	}


	public String getStatus() {
		return status;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", dept=" + dept + ", sal=" + sal + ", status=" + status
				+ "]";
	}
	
	
	
}

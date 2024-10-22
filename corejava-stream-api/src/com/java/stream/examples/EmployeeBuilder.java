 package com.java.stream.examples;

public class EmployeeBuilder {
	private String empId;
	private String name;
	private int    age;
	private String gender;
	private String dept;
	private String sal;
	private String status;
	private int    yearOfJoining;
	
	public EmployeeBuilder setEmpId(String empId) {
		this.empId = empId;
		return this;
	}
	public EmployeeBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public EmployeeBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	public EmployeeBuilder setGender(String gender) {
		this.gender = gender;
		return this;
	}
	public EmployeeBuilder setDept(String dept) {
		this.dept = dept;
		return this;
	}
	public EmployeeBuilder setSal(String sal) {
		this.sal = sal;
		return this;
	}
	public EmployeeBuilder setStatus(String status) {
		this.status = status;
		return this;
	}
	public EmployeeBuilder setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
		return this;
	}
	
	public Employee build() {
		return new Employee(empId, name, age, gender, dept, sal, status, yearOfJoining);
	}
}

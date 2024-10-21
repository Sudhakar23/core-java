package com.java.common;


public class Employee {
	
	private String empId;
	private String name;
	private int    age;
	private String gender;
	private String dept;
	private String sal;
	private String status;
	private int    yearOfJoining;
	
	public Employee(){}

	
	public Employee(String empId, String name, String dept, String sal, String status) {
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
		this.status = status;
	}

    	
	
	public Employee(String empId, String name, int age, String gender, String dept, String sal, String status,
			int yearOfJoining) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
		this.sal = sal;
		this.status = status;
		this.yearOfJoining = yearOfJoining;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
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
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", gender=" + gender + ", dept=" + dept
				+ ", sal=" + sal + ", status=" + status + ", yearOfJoining=" + yearOfJoining + "]";
	}

}

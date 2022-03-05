package com.core.lambda.exericse.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExerciseJavaTechies {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("001", "Nitish", 	25, "Male", 	"HR", 					"24000", "active", 2014),
				new Employee("002", "Amit", 	25, "Male", 	"Sales & Mkt",			"20000", "active", 2014),
				new Employee("003", "Diya", 	22, "Female", 	"HR", 					"14000", "active", 2017),
				new Employee("005", "Venkat", 	20, "Male", 	"Product Development", 	"25000", "active", 2018),
				new Employee("004", "Suresh",	24, "Male", 	"Infrastructure",	 	"25000", "active", 2010),
				new Employee("006", "Sumit", 	19, "Male", 	"Account & Finance", 	"18000", "active", 2019),
				new Employee("007", "Naveen", 	18, "Male", 	"Product Development", 	"17500", "active", 2018),
				new Employee("008", "Abhishek", 18, "Male", 	"Product Development", 	"14000", "active", 2020),
				new Employee("009", "Kiran", 	19, "Female", 	"Infrastructure", 		"16000", "active", 2014),
				new Employee("002", "Kanak", 	25, "Female", 	"Sales & Mkt",			"20000", "active", 2014)
		);
		
		//1. Gender count
		Map<String, Long> genderCount = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(genderCount);
		System.out.println("--------------------------");
		
		//2. Distinct Dept Print name of all dept
		List<String> collect = employees.stream().map(Employee::getDept).distinct().collect(Collectors.toList());
		System.out.println(collect);
		System.out.println("--------------------------");
		
		//3. Average age of male and female employee
		Map<String, Double> collect2 = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(collect2);
//		collect2.entrySet().forEach(e -> e.getKey() +":" +e.getValue());
		System.out.println("--------------------------");
		
		//4. Details of highest paid employee
		Optional<Employee> empMaxSal1 = employees.stream().max(Comparator.comparing(Employee::getSal));
		System.out.println("empMaxSal "+empMaxSal1.get());
		Optional<Employee> empMaxSal2 = employees.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSal)));
		System.out.println("empMaxSal "+empMaxSal2.get());
		System.out.println("--------------------------");
		
		
		//5. All emp joined after 2016
		List<Employee> empJoinedAfter1 = employees.stream().filter(emp -> emp.getYearOfJoining() > 2018).collect(Collectors.toList());
		System.out.println(empJoinedAfter1);
		System.out.println("--------------------------");
		
		//6. Count no of emp in each dept
		Map<String, Long> empCountDeptwise = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
		System.out.println("empCountDeptwise : \n" +empCountDeptwise);
		empCountDeptwise.entrySet().forEach(e -> System.out.println(e.getKey() +" :: " +e.getValue()));
		System.out.println("--------------------------");
		
		//7. What is the average sal of each department.
		Map<String, Double> avgSalDept = employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingInt(emp -> Integer.parseInt(emp.getSal()))));
		avgSalDept.entrySet().forEach(emps -> System.out.println(emps.getKey() +" == "+emps.getValue()));
		System.out.println("--------------------------");
		
		//8. Get the details of youngest male employee in the product development dept
		Optional<Employee> minAgeDept = employees.stream()
				.filter(emp -> emp.getDept().equals("Product Development") && emp.getGender().equalsIgnoreCase("male"))
				.min(Comparator.comparing(Employee::getAge));
		System.out.println(minAgeDept.get());
		System.out.println("--------------------------");
		
		
		//9. Who has the most working exp in the org
		Optional<Employee> minAge = employees.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
		System.out.println("minAge :" +minAge.get());
		Optional<Employee> minAge_2 = employees.stream().min(Comparator.comparingInt(Employee::getAge));
		System.out.println("minAge :" +minAge_2.get());
		System.out.println("--------------------------");
		
		Optional<Employee> sorted = employees.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
		System.out.println(sorted.get());
		//10. How many male and female emp in sales and marketing department
		Map<String, Long> saleMktEmpCount = employees.stream().filter(emp -> emp.getDept().equals("Sales & Mkt")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("saleMktEmpCount : "+saleMktEmpCount);
		saleMktEmpCount.entrySet().forEach(res -> System.out.println(res.getKey()+":"+res.getValue()));
		
		//11. Average sal of male and female emp
		
		//12. List down name of all emp in each dept
		
		//13. What is the average and total sal of whole organization 
		
		//14. 
		
	}

}

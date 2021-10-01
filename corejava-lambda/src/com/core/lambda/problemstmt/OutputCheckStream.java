package com.core.lambda.problemstmt;

import java.util.ArrayList;
import java.util.List;

public class OutputCheckStream {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList();
		animals.add(new Cat());
		animals.add(new Dog());
		
		animals.stream().forEach(animal -> System.out.println(animal));
 	}
}

class Animal{
	
}
class Cat extends Animal{}
class Dog extends Animal{}

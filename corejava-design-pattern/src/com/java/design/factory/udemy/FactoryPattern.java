package com.java.design.factory.udemy;

/*
 *Factory Pattern
 *Want to create objects implementing same interface or having same parent.
 * 
 * 
 */

public class FactoryPattern {

	public static void main(String[] args) {
		Animal animal = AnimalFactory.createAnimal(AnimalFactory.CAT);
		animal.speak();
		Animal animal2 = AnimalFactory.createAnimal(AnimalFactory.DOG);
		animal2.speak();

	}

}

package com.java.design.factory.udemy;

public abstract class AnimalFactory {
	public static final int CAT = 0;
	public static final int DOG = 1;
	
	public static Animal createAnimal(int type) {
		
		switch(type) {
		case 0: return new Cat();
		case 1: return new Dog();
		}
		return null; 	 
	}
}

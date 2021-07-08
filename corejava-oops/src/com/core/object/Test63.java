package com.core.object;
abstract class Animal{
	abstract void eating();
	abstract void sleeping();
	void animal(){
		System.out.println("asdfdsfsadfsadfasdf");
	}
}
abstract class Dog extends Animal{
	void eating(){
		System.out.println("Dog is Eating");
		super.animal();
	}	
}
class MyDog extends Dog{
	void sleeping(){
		System.out.println("MyDog is sleeping");
	}
}
abstract class Cat extends Animal{
	void eating(){
		System.out.println("Cat is Eating");
	}
	void sleeping(){
		System.out.println("Cat is sleeping");
	}
}
class MyCat extends Cat{

}
class AnimalFactory{
	public static final int DOG = 1;
	public static final int CAT = 2;
	public static Animal getAnimal(int a){
		Animal ani = null;
		if(a==1){
			ani = new MyDog();
		} else if(a==2){
			ani = new MyCat();
		}
		return ani;			
		}
}
class Test63{
	public static void main(String args[]){ 	  Animal ani = null;
	  ani = AnimalFactory.getAnimal(AnimalFactory.DOG);
	  show(ani);
	  ani = AnimalFactory.getAnimal(AnimalFactory.CAT);
	  show(ani);
	}
	static void show(Animal ani){
		ani.eating();
		ani.sleeping();
	}
}
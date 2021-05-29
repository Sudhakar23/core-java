package com.core.polymorphism;

class Hai{}
class Hello extends Hai{}

public class Test58 {
	public static void main(String[] args) {
		
	
	Hai hai = new Hai();
	Hello h = new Hello();
	
	Hai hai1 = new Hello();
	Hello h1 = (Hello) new Hai();
	Hai hai2 = hai;
	Hai hai3 = h;
	Hello h2 = (Hello)hai;
//	Hello h3 =  hai1;
	}
}

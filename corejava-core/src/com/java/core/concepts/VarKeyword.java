package com.java.core.concepts;

public class VarKeyword {
	public static void main(String[] args) {
//		var tricky ; // Does not compile
//					 // Cannot use 'var' on variable without initializer
//		tricky = "Hi";
//		System.out.println(tricky);
		System.out.println("-----------------------------");
		
		int a, var b = 3; // Var not allowed in compound declaration 
//		var c = 5, d = 3; // Var not allowed in compound declaration 
//		var n = null;	  // Cannot infer type for local variable initialized to 'null'
		
		System.out.println("End");
	}
	
	public int add(var a, var b) { 	// var not allowed here 
		return a+b;		// var is used only for local variable type inference!
	}
}

class Var {
	public void var() {
		var var = "var";
	}
	public void Var() {
		Var var = new Var();
	}
}

package com.lara.thread.exercise1;
class J extends Thread{
//	J(){
//		
//	} 
	J(String name){
		super(name);
		System.out.println("parameterised construcotr");
	}
	public void run(){
		System.out.println(getName() +" started");
	}
}
public class Manager12 {

	public static void main(String[] args) {
//		J obj1 = new J();
	J obj2 = new J("rupsi");
//		J obj3 = new J();
//		
//		obj1.start();
		obj2.start();
//		obj3.start();
//
//		J obj4 = new J();
//		J obj5 = new J();
//		J obj6 = new J();
//	
//		obj4.start();
//		obj5.start();
//		obj6.start();
	}

}

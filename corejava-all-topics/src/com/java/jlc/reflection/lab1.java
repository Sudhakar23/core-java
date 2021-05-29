package com.java.jlc.reflection;
import java.lang.reflect.*;


interface i1{}
interface i2{}
class A {}
class B{}
class Hello extends A implements i1, i2{
	int a = 10;
	int b = 3;
	Hello(){}
	Hello(int b){
		this.b = b;
	}
	void show(){
		System.out.println(a +" from A ");
		System.out.println(b +" from A ");
	}
}
public class lab1 {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4};
		try{
			
			
			Hello hh = new Hello();
			hh.show();
			Class cls = Class.forName("com.jlc.reflection.Hello");
			System.out.println(cls);
			System.out.println(Class.forName("com.jlc.reflection.Hello").getInterfaces());
////			
//			Class  c[] = cls.getInterfaces();
//			for(int i = 0;i<c.length;i++){
//				System.out.println(c[i].getName());
//			}
//			
			System.out.println(cls.getModifiers());
			System.out.println(Modifier.PUBLIC);
			System.out.println(Modifier.FINAL);
			
		}catch(Exception e){
			e.printStackTrace();
	 	}
	}
}
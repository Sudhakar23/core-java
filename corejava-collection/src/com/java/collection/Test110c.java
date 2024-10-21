package com.java.collection;
import java.util.*;
class Hello1{
	void m1(){
		System.out.println("Hello in M1");
	}
}
public class Test110c {
	
	public static void main(String[] args) {
		ArrayList color = new ArrayList();
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		
		ArrayList vege = new ArrayList();
		vege.add("Potato");
		vege.add("spinich");
		vege.add("Tomato");
		vege.add("Chili");
		
		System.out.println("color -> " +color);
		System.out.println("vege -> " +vege +"\n\n");
		vege.addAll(color);
		//System.out.println(vege.add(color));
		//vege.addAll(color);
		
		
		System.out.println("1 vege -> " +vege);
	
		color.retainAll(vege);
		System.out.println("  colour -> " +color);
		System.out.println("2 vege -> " +vege);
		
//		color.retainAll(vege);
//		System.out.println("3 vege -> " +vege);
		
	/*	System.out.println("Using iterator");
		Iterator colorI = color.iterator();
		System.out.println(colorI);
		
		while(colorI.hasNext()){
			System.out.println(colorI.next());
		}
					
		System.out.println("***List Iterator***");
		ListIterator colorLI = color.listIterator();
		while(colorLI.hasNext()){
			System.out.println(colorLI.next());
		} */
		
		//vege.retainAll(color);
		//color.retainAll(vege);
		
	}
}
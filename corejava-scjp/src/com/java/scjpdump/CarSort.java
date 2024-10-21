package com.java.scjpdump;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



class Car22 implements Comparable<Car22>{
int num;
String name;
String modal;
int cost;
public Car22(int n, String na, String mo, int co) {
	
	num = n;
	name = na;
	modal = mo;
	cost = co;
}
@Override
public int compareTo(Car22 d) {
/*	if (this.cost < d.cost)
		return -1;
	else if (this.cost > d.cost)
		return 1;
	else  
		return 0; */
	return  d.cost - this.cost;
	
}

public String toString(){
	return num+" "+name+" "+modal+" "+cost+" "+"\n";
}

}


public class CarSort {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(new Car22(1,"bmw","rl222",2222));
	al.add(new Car22(2,"bmw1","rl223",2233));
	al.add(new Car22(5,"bmw2","rl2244", 2244));
	al.add(new Car22(3,"bmw3","rl2266",2211));
	al.add(new Car22(4,"bmw4","rl2288",2200));
	al.add(new Car22(6,"bmw5","rl2288",2233));
	Collections.sort(al);
	System.out.println(al);
	//System.out.println(it);
}
}

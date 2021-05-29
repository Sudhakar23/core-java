package com.java.scjpdump;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Car {
	int num; 
	String name;
	String modal;
	String cost;
	public Car(int n, String na, String mo, String co) {
		
		num = n;
		name = na;
		modal = mo;
		cost = co;
	}
	public String toString() {
		return num + " " + name + " " + modal +""+cost+ "\n";
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModal() {
		return modal;
	}
	public void setModal(String modal) {
		this.modal = modal;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
}
public class carSort1 {
	
public static void main(String[] args) {
	
	Comparator<Car> c = new Comparator<Car>(){

		@Override
		public int compare(Car o1, Car o2) {
		
			return o1.getCost().compareTo(o2.getCost());
		}
		
	};
	ArrayList<Car> al=new ArrayList<Car>();
	al.add(new Car(1,"MrX","verna ","3333"));
	al.add(new Car(2,"MrX","vmw ","3356"));
	al.add(new Car(6,"MrX","xuv ","5643"));
	al.add(new Car(3,"MrX","e800 ","2563"));
	al.add(new Car(5,"MrX","ultra ","7834"));
	al.add(new Car(4,"MrX","maruti ","3432"));
	//CostSort cs=new CostSort();
	Collections.sort(al, c);
	System.out.println(al);
} 

}

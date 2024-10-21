package com.java.polymorphism;
class L{
	int i;
	L(int i){this.i=i;}
	public String toString(){
		return "i= "+i;
	}
}
class M extends L{
	int j;
	M(int i, int j){
		super(i);
		this.j=j;
		
	}
	public String toString(){
		
		return super.toString()+",j= "+j;
	}
}
public class Prog10 {
public static void main(String[] args) {
	L l=new L(10);
	M m=new M(20,30);
	System.out.println(l);
	System.out.println(m);
}
}

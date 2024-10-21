package com.java.cloning;
class Addr{
	String str;
}
class AA implements Cloneable{
	int a;
	String str;
	Addr addr;
	public AA() {
	}
	AA(int a, String str, Addr addr){this.a=a;this.str=str;this.addr=addr;}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
public class CloneTest {	
	public static void main(String[] args)throws CloneNotSupportedException{
		AA a1 = new AA(1,"Amit",new Addr());
		AA a2 = (AA)a1.clone();
		System.out.println(a1);
		System.out.println(a2);
	}
}

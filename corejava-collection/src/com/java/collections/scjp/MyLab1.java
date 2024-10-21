package com.java.collections.scjp;
class Hello{
	
	double a;
	String myname;
	Hello(String str,double dou){
		this.a=dou;
		this.myname=str;
	}
	@Override
	public String toString() {
		//System.out.println("this is object of class hello");
		return("this is object of class hello.my name ==  " + myname  +"  and my height is" +a);
	}
}
public class MyLab1 {
	public static void main(String[] args) {
		
		MyLab5 he=new MyLab5();
		System.out.println(he);
		//System.out.println(he.hashCode());
		//System.out.println(he.toString());
		//System.out.println(he);
	}

}

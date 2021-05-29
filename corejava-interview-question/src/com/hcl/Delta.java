package com.hcl;
interface Foo{}
class Alpha implements Foo{}
class Beta extends Alpha{}
class Gama extends Beta{}
public class Delta extends Gama{
	public static void main(String[] args) {
		Beta x = new Beta();
//		Alpha x = new Alpha();
//		Beta b = (Beta)(Alpha)x;
//		Alpha a = x;
		Foo f = (Gama)(Alpha)x;
		System.out.println("End");
	}
}



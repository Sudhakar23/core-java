package com.java.jlc.reflection;

class AA{
	static void m6(){
		System.out.println("M6 in Hai");
	}	
}

public class Test {
	
	public static void main(String[] args) {

		AA h1 = new AA();
		AA h2 = new AA();
		AA h3 = new AA();
		h3 = h2;// = h1;
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		System.out.print(h3.hashCode());		

	}

}

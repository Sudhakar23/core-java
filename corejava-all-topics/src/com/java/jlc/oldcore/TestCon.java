package com.java.jlc.oldcore;
class A {
	int a=112;
	int d = 1000;
	{
		System.out.println("IB in a class A");
	}
	static{	
		int e = 1000;
		System.out.println("SB in a class A");
	}	
/*	A(){
		System.out.println("A in a class");
	}*/
	int ma(){
		System.out.println("Ma in a class");
		return 0;
	}
}
class TestCon{
	
	public static void main(String args[]){
	//A ob1 = new A();
	}
}
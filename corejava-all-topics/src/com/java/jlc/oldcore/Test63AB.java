package com.java.jlc.oldcore;
abstract class AA {
	abstract void m1();
	abstract void m2();
}
abstract class BB extends AA{
	void m1(){
		System.out.println("M1 in B");
	}
	//void m2(){}
}
class CC extends BB{
	void m2(){}
}
class AbstTest63{
	public static void main(String args[]){
	
	}
}
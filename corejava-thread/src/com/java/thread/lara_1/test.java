package com.java.thread.lara_1;
class AA{
	AA(){
		System.out.println("constructor of A");
	}
}
class B extends AA{
//	B(){}
	B(int a){
		System.out.println("constructor of B");
	}
//	B(){
//		System.out.println("constructor of B");
//		Object obj;
//	}
}
class BB extends B{
	BB(){
		super(2);
	System.out.println("constructor of BB");
	}
}
public class test {
	public static void main(String[] args) {
		BB b = new BB();
	
	}
}	

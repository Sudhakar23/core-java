package com.java.thread;
abstract class B{
	 abstract int b();
	 void bb(){
		 
	 }
}
interface I{
	void ifirst();
	void isec();
	//void cc(){} 
	
}

class A extends B implements I{
	public int b(){
		return 1;
	}
	public void run() {
		
	}
	public void ifirst(){}
	public void isec(){}
	
}
public class Test3 {
public static void main(String[] args) {
	
}
}

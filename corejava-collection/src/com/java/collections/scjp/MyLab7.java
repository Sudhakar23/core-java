package com.java.collections.scjp;
class J{
	J(){
		System.out.println("constructor j");
	}
}
	class L extends J{
		L(){
			
			System.out.println("constructor l");
		}
	}
	
	class M extends L{
		M(){
			super();
			System.out.println("constructor M");
		}
	}
	class N extends M{
		N(){
			System.out.println("constructor n");
		}
	}

public class MyLab7 {
public static void main(String[] args) {
	N n=new N();
	
}
}

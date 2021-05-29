package com.java.collections.scjp;
abstract class NN{
	NN(int f){
		System.out.println("kkkkk");
	}
}
class MM extends NN{
	MM(){
		super(4);
	}
}
public class MyLab8 {
	MyLab8(){}
	MyLab8(int a){}
	public static void main(String[] args) {
		MM m=new MM();
	}
}

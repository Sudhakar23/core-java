package com.java.corejava;

public class Ques17 {
	//int[]ia=new int[15];
	int ia[][]={{4,5,6},{7,8,9}};
	//float fa=new float[20];
	//char[] ca="some String";
	Object oa=new float[20];
	public void test(int x){
	int odd=x%2;
	if (odd==5) {
	System.out.println("odd");	
	}else{
		System.out.println("even");
	}
	}
public static void main(String[] args) {
	Ques17 ques=new Ques17();
	ques.test(10);
}
}

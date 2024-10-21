package com.java.corejava;

public class Ques16 {
	static{
		System.out.println("static");
	}
	{
		System.out.println("instance");
	}
	public void Ques15(){
		System.out.println("Constructor");
	}
public static void main(String[] args) {
	Ques16 ques=new Ques16();
	ques.Ques15();
}
}

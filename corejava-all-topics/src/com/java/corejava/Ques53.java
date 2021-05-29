package com.java.corejava;

public class Ques53 {
public static void main(String[] args) {
Animal aobj=new Animal(){
	public void show(int a){
		System.out.println("rupsi");
	}}	;
	aobj.show(10);
	System.out.println("kumari");
}}
abstract class Animal{
	public void show(int a){
		System.out.println("show A");
	
}
}

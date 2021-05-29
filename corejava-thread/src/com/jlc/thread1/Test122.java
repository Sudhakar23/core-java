package com.jlc.thread1;

interface I1{
	public void run();
	public void start();
}
abstract class Hello1 implements I1{
	public void run(){
		System.out.println("I m in Hello to run");
	}
	abstract void m1();
}
class Hai1 extends Hello1{
	public void start(){
		System.out.println("I am in Hai to run");
	} 
	public void m1(){
		System.out.println("m1 in Hai");
	}
}
public class Test122 {
	public static void main(String[] args) {
		Hello1 h1 = new Hai1();
		h1.m1();
	}
}

package com.lara.thread.lifecycle;
class Rupsi{}
public class Manager1 {
public static void main(String[] args) {
	Rupsi r=new Rupsi();
	System.out.println(r);
	Thread.State state[]=Thread.State.values();
	for(Thread.State states:state){
		System.out.println(states);
	}
}
}

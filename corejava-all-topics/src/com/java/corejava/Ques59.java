package com.java.corejava;
class Value{
	public int i=15;
}
public class Ques59 {
public static void main(String[] args) {
Ques59 q=new Ques59();
q.first();
}
public void first(){
	int i=5;
	Value v=new Value();
	v.i=25;
	second(v,i);
	System.out.println(v.i);
}
public void second(Value v,int i){
	i=0;
	v.i=20;
	Value v1=new Value();
	v= v1;
	System.out.println(v.i+"+i");
}
}

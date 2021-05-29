package com.java.typingcode;
class H{
	private int s;
	H(int s){
		this.s=s;
	}
	public H m22(int s){
		if (this.s==s) {
			return this;
			
		}else{
			return new H(s);
		}
	}
}
class Hi extends H{

	Hi(int s) {
		super(s);
		
	}
	
}
public class A11 {
public static void main(String[] args) {
	H h=new H(10);
	Hi hi=new Hi(102);
	System.out.println("test");
}
}

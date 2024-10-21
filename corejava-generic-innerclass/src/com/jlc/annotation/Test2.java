package com.jlc.annotation;

import java.util.Collection;

class SuperUser{
	void display(){
		
	}
}
class User extends SuperUser{
	

	@Override
	public String toString(){
		return "User ojb";
	}
	@Override
	public int hashCode(){
		return 7878;		
	}
	@Deprecated
	public void sh(){
		System.out.println("123456789");
	}	
	@Override
	void display(){
		System.out.println("sfsdf");
	}
}
public class Test2 {

	public static void main(String[] args) {
		User u1 = new User();
		u1.display();
		u1.sh();
	}
}
package com.java.myprog;

public class String2 {
public static void main(String[] args) {
	String sg=new String();
	String sg1="spring";
	System.out.println(sg1);
	String sg2=sg1+"  summer";
	System.out.println(sg2);
	sg1.concat("fall ");
	System.out.println(sg1);
	sg2.concat(sg1);
	System.out.println(sg2);
	sg1+="winter ";
	System.out.println(sg1+"  "+sg2);
}
}

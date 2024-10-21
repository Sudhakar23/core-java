package com.java.polymorphism;
class G{
	int i;
	G(int i){
		this.i=i;
	}
	public String ToString(){
		return "i= "+i;
	}
}
class H{
	G g1;
	int j;
	H(G g1, int j){
	this.g1=g1;	
	this.j=j;
	}
	public String toString(){
		return "G1= "+g1+" j= "+j;
	}
}
public class Prog7 {
public static void main(String[] args) {
	G g1=new G(90);
	String s2="hello"+g1;
	System.out.println(s2);
	H h1=new H(g1,60);
	//System.out.println(g1);
	//System.out.println(h1);
}
}

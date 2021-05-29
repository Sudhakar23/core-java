package com.java.lara.polymorphism;

public class Prog41 {
	//static void test(int...x){System.out.println(x.length);}
	//static void test(int...arg){System.out.println("test(var-ags)");}

 static void test(String...varArg){
	 for (String s1 : varArg) {
		System.out.println(s1+"--");
	}
	 System.out.println("===");
 }
public static void main(String[] args) {
	/*test();
	test(10);
	test(10,30);
	test(40,50,90);
	test(8,240,150,910);*/
	test();
	test("ccc");
	test("aaa","hhhh","jjjj");
	test("aaa","hhhh","jjjj","llll");
	/*test();
	test(11,2,333);
	test(222,444,66,77);
	test(5555,44,88,99,2222);*/
	
}
}

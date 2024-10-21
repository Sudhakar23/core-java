package com.scjpdumps;
 class Wow {
 public static void go(short n) {System.out.println("short");}
 public static void go(Short n) {System.out.println("SHORT");}
 public static void go(Long n) {System.out.println(" LONG");}
 public static void main(String [] args) {
 Short y = 6;
 int z = 7;
 go(y);
 go((short)z);
 }
 }
class Test{
	public static void test(String str) {
		 if (str == null | str.length() == 0) {
		 System.out.println("String is empty");
		 } else {
		 System.out.println("String is not empty");
		 }
		 }
}
public class Q14 {
public static void main(String[] args) {
	Test t = new Test();
	t.test(null);
}
}

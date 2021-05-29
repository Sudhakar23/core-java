package com.java.jlc.oldcore;
class A3{
  static {
	System.out.println("SB in A");
	B b1 = new B();
   }
  public static void main(String args[]){
	  System.out.println("Main in A");
  }
}
class B{	
  static{
    System.out.println("SB in B");
	A3 a1 = new A3();
	String str[] = {" "};
	a1.main(str);
	main(str);
   }
  public static void main(String args[]){
      System.out.println("Main in B");	  
  }
}
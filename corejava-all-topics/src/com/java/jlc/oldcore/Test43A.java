package com.java.jlc.oldcore;
class Test43A{
	static{
		System.out.println("SB in Test43");
		main("abc");	
	}	
	public static void main(float ...f){
		System.out.println("main(float...str)");
	}
	public static void main(int...a){
		System.out.println("main(int...a)");
	}	
	public static void main(String str){
		System.out.println("main(String str)");
		main("abc","sun","","blore");
	}
	public static void main(String ...args){
		System.out.println("main(String...str)");
		//main(100);
		//main(0);
		//main();
	}
}

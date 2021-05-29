package com.java.jlc.oldcore;
class Hello52{
	int a = 10, b = 20;
	static int c = 30;
	{
		System.out.println("IB in Hello");
	}
	static{
		System.out.println("SB1 in Hello");
	}	
	void show(){
		System.out.println("Show in Hello");
		System.out.println(a +" " +b +" "+c);
	}
}
class Hai52 extends Hello52{
	int a11 = 11, b11 = 22;
	static int c11 = 33;
	{
		System.out.println("IB1 in Hai");
	}
	static{
		System.out.println("Sb1 in Hai");
	}
	void show2(){
		System.out.println("Show2 in Hai");
		System.out.println(a +" " +b +" "+c);
		System.out.println(a11 +" " +b11 +" "+c11);
	}
}
class Test52{
	public static void main(String arg[]){
			Hai52 hai = new Hai52();
			Hello52 h1 = new Hello52();
			System.out.println();
		hai.show();
		hai.show2();
		h1.show();
		//h1.show2();
	}
}
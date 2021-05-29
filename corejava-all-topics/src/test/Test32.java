package test;
class Hello11{
	static {
		System.out.println("static in Hello");
	}
	int a = 10, b = 20;
	static int c = 45;
} 

public class Test32 {
	int ab = 12;
	static int b22 = 303;
	{
		System.out.println("IB in Test32");	
	}
	static{
		System.out.println("SB in Test32");
	}
	public static void main(String[] args) {
	//	Test32 tst = new Test32();
		System.out.println("in main");
		System.out.println(Hello11.c);
		//Hello h = new Hello();     
		
	}
}

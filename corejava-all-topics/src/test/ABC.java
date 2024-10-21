package test;

class I11{
	static{
		System.out.println("SB in I11");
	}
	{
		 System.out.println("IB in I11");
	}
	static void I11(){
		System.out.println("constructor in I1");
	}
	static int m1(){
		System.out.println("M1 in i11");
		return 0;
	}
	static void m11(){
		System.out.println("M1 in i11");
	}
}

public abstract class ABC{

	public static void main(String[] args) throws Exception{
//		I11 i = new I11();
		Class cls = Class.forName("test.I11");
		
		I11 i = (I11)cls.newInstance();
		
//		I11 i = new I11();
//		System.out.println(cls);0
//		I11.m11();
//		System.out.println(I11.m1());
	                                                                                                                                                                                                                                                                                                                                                                                        }
	
}

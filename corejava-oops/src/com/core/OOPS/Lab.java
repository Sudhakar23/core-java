package com.core.OOPS;

public class Lab {
	public static void main(String[] args) {
		System.out.println("Main Method");
//		System.out.println(XYZ.var);
		System.out.println("===========");
//		int a = XYZ.abc;
//		System.out.println(XYZ.abc);
		new ABC();
	}	
}
class ABC{
	static int abc = 123;
	static{
		System.out.println("SB in ABC");
	}
	{
		System.out.println("IB in ABC");
	}	
}
class XYZ extends ABC{
	static int xyz = 321;
	static{
		System.out.println("SB in XYZ");
	}
	{
		System.out.println("IB in XYZ");
	}	
}
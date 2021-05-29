package test;

class Hello {
	Hello(){
		System.out.println("Const in Hello");
	}
	{
		System.out.println("Instance in Hello");
	}
	static{
		System.out.println("Static in Hello");
	}
	
}

class Hai extends Hello {
	Hai(){
		System.out.println("Const in Hai");
	}
	{
		System.out.println("Instance in Hai");
	}
	static{
		System.out.println("Static in Hai");
	}
}

class Buy extends Hai {
	 int a;
	Buy(){
		System.out.println("Const in Buy");
		this.a = 12;
	}
	{
		System.out.println("Instance in Buy");
		System.out.println("a is : " +a);
	}
	static{
		System.out.println("Static in Buy");
	}
}

public class TestInheritance {
	public static void main(String[] args) {
//		Buy b = null;
//		System.out.println(b.a);
		Buy b = new Buy();
		System.out.println(b.a);
	}
}

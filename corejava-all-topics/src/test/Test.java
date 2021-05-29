package test;
interface i1{}
class C1 implements i1{}
class Hello1{
	int a , b ;
	static int c = 30;
	
	Hello1(){
		System.out.println("Default constructor");
		System.out.println(this);
	}
	Hello1(int a , int b){ 
		System.out.println("2 para constructor");
		this.a = a;
		this.b = b;
		System.out.println(this);
	}
	void show(){ 
		System.out.println("Show in Hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(this);
	}
	static{
		 int q = 9;
	}
}
	
public class Test{	
	public static void main(String[] args) {
		Hello1 h1 = new Hello1();
		h1.show();
		i1 i = null;
		i = new C1();
		
//		System.out.println(h1);
		/*System.out.println("---------------");
		Hello1 h2 = new Hello1(3,7);
		h2.show();*/
//		System.out.println(h2);
	}
}
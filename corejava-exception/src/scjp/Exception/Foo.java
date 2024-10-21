package scjp.Exception;

public class Foo {
public static void main(String[] args) {
	Foo f=new Foo();
	int r=f.m1();
	System.out.println(r);
}
int m1(){
	try {
		int a=12;
		System.out.println(a+"aaa");
		int b=a/0;
		System.out.println("ss");
		System.out.println("s");
		System.out.println("sss");
	}catch (Exception e) {
	System.out.println("yy");	
	}
	return 1;
}
}

package com.jlc.annotation;
import java.lang.annotation.*;
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Author{
	String aname();
	int age();
}
@Author(aname = "som", age = 38)

class Hai{
	@Deprecated
	void m1(){}
}
class A extends Hai{
	void m1(){}
}

public class Test5 {
	
	public static void main(String[] args) {
		try{
			Class cls = Class.forName("com.jlc.annotation.A");
			boolean b = cls.isAnnotationPresent(Author.class);
			System.out.println("b is : " +b);
			if(b==false){
				Author a = (Author)cls.getAnnotation(Author.class);
				System.out.println(a.aname() +" " + a.age());
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}

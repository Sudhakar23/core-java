//example using colning 
package com.java.jlc.langlab;

class A{
	int x ;
	A(int x){
		this.x=x;
	}
}
class B{
	int p;
	A aobj;
	B(int p, A aobj){
		this.p=p;
		this.aobj=aobj;		
	}
}
class C{
	int q;
	B bobj;
	C(int q, B bobj){
		this.q=q;
		this.bobj=bobj;
	}
}
class Hello implements Cloneable{
	int a;
	C cobj;
	Hello(){}
	Hello(int a, C cobj){
		this.a = a;
		this.cobj = cobj;		
	}
	void show(){
		System.out.println(a);
		System.out.println(cobj.q);
		System.out.println(cobj.bobj.p);
		System.out.println(cobj.bobj.aobj.x);		
	}
	public Hello myClone(){
		Hello h = null;
		Object o = null;
		try{
			o = this.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		h = (Hello)o;
		return h;
		
	}
}
public class Lab4 {

	public static void main(String[] args) {
		A aobj = new A(10);
		B bobj = new B(20, aobj);
		C cobj = new C(30,bobj);
		Hello h = new Hello(40, cobj);
		h.show();
		Hello h1 = h.myClone();
		h1.show();

	}

}

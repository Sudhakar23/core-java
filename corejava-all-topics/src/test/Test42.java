package test;
class A{
	A a2 = null;
	void m1(){
		System.out.println("M1 in A");
	}
}
public class Test42 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		
		a1.a2 = a2;
		a2.a2 = a1;
		if(a2.equals(null)){
			System.out.println("a2 is empty");
		}
		a2.m1();
		a1.a2.m1();
	}
}

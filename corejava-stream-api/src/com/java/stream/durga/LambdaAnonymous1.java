package com.java.stream.durga;

@FunctionalInterface
interface I01 {
	public void m1();
}

class Test1{
	
}
// Udmey Dugrasoft java8 video-23
public class LambdaAnonymous1 {
	int x = 10;
	public void m1() {
		
		int y = 20;
		I01 i = () -> {
//			y = 21; //Local variable y defined in an enclosing scope must be final or effectively final
			System.out.println(x);
			System.out.println(y);
		};
		i.m1();
	}
	public static void main(String[] args) {
		LambdaAnonymous1 t = new LambdaAnonymous1();
		t.m1();

	}

}

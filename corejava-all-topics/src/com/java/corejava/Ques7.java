package com.java.corejava;
class TestSuper{
	int i;
	TestSuper(){}
	TestSuper(int i){
		this.i=i;
	}
	public String toString(){
		return "as"+i;
}

}
class TestSub extends TestSuper{
	
}
public class Ques7 {
public static void main(String[] args) {
	new TestSub();
	TestSuper r=new TestSuper(2);
	System.out.println(r);
}
}

package test;

class SingleTest {
	static SingleTest st = null;

	private SingleTest(){
		
	}
	static{
//		st = new SingleTest();
	}
	static SingleTest getSingleton(){
		return st;
	}
}
public class SingletonTest{
	public static void main(String[] args) {
		SingleTest st = SingleTest.getSingleton();
		System.out.println(st);
		
		SingleTest st1 = SingleTest.getSingleton();
		System.out.println(st1);
		
		SingleTest st2 = SingleTest.getSingleton();
		System.out.println(st2);
		String st4 = "sadf";
		SingleTest st3 = SingleTest.getSingleton();
		System.out.println(st3);
	}
}


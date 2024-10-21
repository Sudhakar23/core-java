package com.lara.thread.dead;

class Test4 {
	int i;
}

class F extends Thread {
	Test4 t;

	F(Test4 i) {
		t = i;
	}
	public void run(){
		System.out.println("1:"+t.i);
		t.i=10;
		Util.sleep(1000);
		System.out.println("2"+t.i);
		t.i=20;
		Util.sleep(1000);
		System.out.println("3"+t.i);
		t.i=30;
		
	}
}
class G extends Thread{
	Test4 t;
	G(Test4 t){
		this. t=t;
	}
	public void run(){
		System.out.println("4:"+t.i);
		t.i=40;
		Util.sleep(1000);
		System.out.println("5"+t.i);
		t.i=50;
		Util.sleep(1000);
		System.out.println("6"+t.i);
		t.i=60;
		
	}
}

public class Manager6 {
public static void main(String[] args) {
	Test4 t=new Test4();
	t.i=70;
	System.out.println("7"+t.i);
	F f=new F(t);
	f.start();
	Util.sleep(500);
	G g=new G(t);
	g.start();
	Util.sleep(2000);
	System.out.println("8"+t.i);
}
}

package com.lara.thread.dead;
class H extends Thread{
	ThreadLocal local;
	H(ThreadLocal local){
		this.local=local;
	}
	public void run(){
		System.out.println("1"+local.get());
		local.set(10);
		Util.sleep(1000);
		System.out.println(local.get());
	}
}
public class Manager7 {
public static void main(String[] args) {
	ThreadLocal tl=new ThreadLocal();
	H h=new H(tl);
	h.start();
}
}

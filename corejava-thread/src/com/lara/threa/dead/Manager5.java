package com.lara.threa.dead;

/*class Util {
	static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
*/
class Model extends Thread{
	public synchronized void goToWait(){
		try{
			wait(5000);
		}catch(InterruptedException ex ){
			ex.printStackTrace();
		}
	}
	public synchronized void release(){
		notify();
	}
	@Override
	public void run() {
		while(true){
			goToWait();
			for (int i = 0; i < 5; i++) {
				System.out.println(getName() +" : " +i);
				Util.sleep(1000);
			}
			release();
		}
	}
}
public class Manager5 {
	public static void main(String[] args) {
		Model m = new Model();
		m.start();
	}
}

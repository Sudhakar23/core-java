package com.java.thread.jenkov;

public class SynchronizedExchangerMain {

	public static void main(String[] args) {
		
		StaticSynchronizedExchanger exchanger = new StaticSynchronizedExchanger();
		
		Runnable runnable1 = () -> {
			for (int i = 0; i < 10000; i++) {
				exchanger.setObject(" " +i); 
//				System.out.println("set " +i);
			}
		};
		
		Runnable runnable2 = () -> {
			for (int i = 0; i < 10000; i++) {
				System.out.println(exchanger.getObject());
			}
		};
		
		new Thread(runnable1).start();
		new Thread(runnable2).start();
	}

}

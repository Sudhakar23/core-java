package com.core.lambda.durga;

public class AnonymousInnerThreadEx {
	public static void main(String[] args) {
//		Runnable runnable = new Runnable() {
//
//			@Override
//			public void run() {
//				for (int i = 0; i < 10; i++) {
//					System.out.println("child Thread " + i);
//				}
//			}
//
//		};
//		new Thread(runnable).start();
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Main Thread " + i);
//		}

		Thread th = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Akki... " + i);
			}
		});
		th.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Noddy ***  " + i);
		}
	}
}
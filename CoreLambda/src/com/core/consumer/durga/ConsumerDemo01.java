package com.core.consumer.durga;

import java.util.function.Consumer;

public class ConsumerDemo01 {
	public static void main(String[] args) {
		Consumer<String> cons = str -> System.out.println(str);
		cons.accept("asdfs");

	}
}

package com.ocp.javase21.ch10.stream;

import java.util.ArrayList;
import java.util.Optional;

public class AdvancedStreamPipeline {

	public static void main(String[] args) {
//		var cats = new ArrayList<String>();
//		cats.add("Annie");
//		cats.add("Ripley");
//		var stream = cats.stream();
//		cats.add("KC");
//		System.out.println(stream.count());

		// Printing string if it has 3 char
		
		Optional<Integer> threeDigit = Optional.of(223);
		AdvancedStreamPipeline.threeDigit(threeDigit);
		AdvancedStreamPipeline.threeDigitStream(threeDigit);
		int num = 10000;
		System.out.println((int)Math.log10(num)+1);
	}

	//Non stream method
	private static void threeDigit(Optional<Integer> optional) {
		if (optional.isPresent()) { // outer if
			var num = optional.get();
			var string = "" + num;
			if (string.length() == 3) // inner if
				System.out.println(string);
		}
	}
	
	private static void threeDigitStream(Optional<Integer> optional) {
		optional.map(n -> ""+n)
			.filter(s -> s.length() == 3)
			.ifPresent(System.out::println);
			
			
	}
	

}

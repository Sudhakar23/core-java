package com.ocp.javase21.ch10.stream;

import java.util.Optional;

public class Option01 {
	public static void main(String[] args) {
		int[] arr = {5,7,8,6,6};
		Optional<Double> average = average(arr);
		System.out.println(average);
	}

	public static Optional<Double> average(int... scores) {
		if (scores.length == 0)
			return Optional.empty();
		int sum = 0;
		for (int score : scores)
			sum += score;
		return Optional.of((double) sum / scores.length);
	}
}

package com.ocp.javase21.ch10.stream;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {

	public static void main(String[] args) {
		// Using reduce to get sum with seed value 0
		Stream<Integer> calculateUsingReduce = Stream.of(1, 2, 3);
		System.out.println(calculateUsingReduce.reduce(0, (a, b) -> a + b));

		// Using map to get sum
		Stream<Integer> calculateculateUsingMap = Stream.of(1, 2, 3);
		System.out.println(calculateculateUsingMap.mapToInt(x -> x).sum());

		// Working with Primitive Streams
		IntStream intStream = IntStream.of(1, 2, 3);
		// System.out.println(intStream.sum());
		OptionalDouble average = intStream.average();
		System.out.println(average.getAsDouble());

		IntStream intRange = IntStream.range(1, 29);
		intRange.forEach(x -> System.out.print(x + " "));
		System.out.println();
		IntStream longRange = IntStream.rangeClosed(1, 29);
		longRange.forEach(x -> System.out.print(x + " "));

		String str = "abc";
		System.out.println(str.repeat(10));

		int max = PrimitiveStreams.max(IntStream.of(1, 2, 3, 4, 5));
		System.out.println(max);

		int range = PrimitiveStreams.range(IntStream.of(1, 2, 3, 4, 5));
		System.out.println(range);

	}

	private static int max(IntStream ints) {
		   OptionalInt optionalMax = ints.max();
		// OptionalInt optionalMin = ints.min(); // We can’t run two terminal operations
		   										 // against the same stream
		   										 // IntSummaryStatistics is solution
		return optionalMax.orElseThrow(RuntimeException::new);
	}

	private static int range(IntStream ints) {
		IntSummaryStatistics stats = ints.summaryStatistics();
		if (stats.getCount() == 0)
			throw new RuntimeException();
		return stats.getMax() - stats.getMin();
	}

}

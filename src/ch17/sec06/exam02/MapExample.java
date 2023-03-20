package ch17.sec06.exam02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapExample {
	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5 };

		IntStream intStream = Arrays.stream(intArray);
		intStream
				.asDoubleStream()
				.forEach(d -> System.out.println(d));

		intStream = Arrays.stream(intArray);
		intStream.boxed()
				.forEach(obj -> System.out.println(obj.intValue()));

		intStream = Arrays.stream(intArray);
		List<Integer> r1 = intStream.boxed()
				.collect(Collectors.toList());
		System.out.println(r1);
	}
}

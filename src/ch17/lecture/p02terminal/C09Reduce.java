package ch17.lecture.p02terminal;

import java.util.*;

public class C09Reduce {
	public static void main(String[] args) {
		List<Integer> list = List.of(9, 1, 2, 3, 5);

		Integer sum = list.stream()
				.reduce((a, b) -> a + b)
				.get();

		System.out.println(sum); //20

		Integer max = list.stream()
				.reduce(Math::max) // (a,b) -> Math.max(a,b)
				.get();

		System.out.println(max); //9

		Integer min = list.stream()
				.reduce(Math::min) //(a,b) -> Math.min(a,b)
				.get();

		System.out.println(min); //1
	}
}
package ch17.lecture.p02terminal;

import java.util.*;

public class C07MaxMin {
	public static void main(String[] args) {
		List<Integer> list = List.of(3, 4, 1, 2, 10, 20);

		Integer max = list.stream()
				.max(Integer::compare) // (x, y) -> Integer.compare(x,y)
				.get();

		System.out.println(max); //20

		Integer min = list.stream()
				.min(Integer::compareTo) // (x, y) -> x.comparTo(y)
				.get();

		System.out.println(min); //1
	}
}
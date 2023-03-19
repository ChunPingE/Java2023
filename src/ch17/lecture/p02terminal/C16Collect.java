package ch17.lecture.p02terminal;

import java.util.*;
import java.util.stream.*;

public class C16Collect {
	public static void main(String[] args) {
		List<Integer> list = List.of(3, 2, 3, 2, 2, 2);

		Map<Integer, Long> r1 = list.stream()
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));

		System.out.println(r1);

		Map<Integer, Integer> r2 = new HashMap<>();

		for (Integer n : list) {
			Integer oldValue = r2.get(n);
			if (oldValue == null) {
				r2.put(n, 1);
			} else {
				r2.put(n, oldValue + 1);
			}
		}
		System.out.println(r2);
	}
}

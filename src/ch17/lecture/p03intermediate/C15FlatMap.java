package ch17.lecture.p03intermediate;

import java.util.Arrays;
import java.util.List;

public class C15FlatMap {
	public static void main(String[] args) {
		List<String> list = List.of(
				"hello world",
				"java program",
				"css html js");

		long count = list.stream()
				.flatMap(s -> Arrays.stream(s.split(" ")))
				.count();
		System.out.println(count); // 7
	}
}

package ch17.lecture.p03intermediate;

import java.util.List;

public class C16Sorted {
	public static void main(String[] args) {
		// sorted : 정렬된 Stream return
		List<String> list = List.of(
				"chisoo",
				"backho",
				"taewoong",
				"taesup",
				"daeman");

		list.stream()
				.sorted()
				.forEach(System.out::println);
		// backho chisoo daeman taesup taewoong
	}
}

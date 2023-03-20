package ch17.lecture.p03intermediate;

import java.util.List;
import java.util.Random;

public class C09Map {
	public static void main(String[] args) {
		// map : 매핑(변환)
		List<String> list = List.of("java", "html", "css");

		list.stream()
				.map(s -> "hello " + s)
				.forEach(System.out::println);
	}
}

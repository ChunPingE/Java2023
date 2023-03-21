package ch17.lecture.p03intermediate;

import java.util.stream.IntStream;

public class C19Sorted {
	public static void main(String[] args) {
		// 5~1 출력
		IntStream.range(1, 6)
				.boxed() // .mapToObj(a -> a)
				.sorted((a, b) -> Integer.compare(b, a))
				// .sorted(Comparator.reverseOrder())
				.forEach(System.out::println);
	}
}

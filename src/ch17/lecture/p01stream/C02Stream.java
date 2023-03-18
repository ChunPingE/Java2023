package ch17.lecture.p01stream;

import java.util.Optional;
import java.util.stream.Stream;

public class C02Stream {
	public static void main(String[] args) {
		// 스트림 만들기
		Stream<Integer> stream1 = Stream.of(9, 8, 7, 1, 2, 3);
		long count = stream1.count();

		System.out.println(count);

		Stream<Integer> stream2 = Stream.of(9, 8, 7, 1, 2, 3);
		Optional<Integer> max = stream2.max(Integer::compare);

		System.out.println(max.get());
	}
}

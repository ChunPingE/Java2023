package ch17.exercise.exam06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", 30),
				new Member("신용권", 40),
				new Member("감자바", 26));

		// 고전for
		System.out.println("고전for문 사용");
		int sum = 0;
		for (Member m : list) {
			sum += m.getAge();
		}
		double avg = (double) sum / list.size();
		System.out.println("평균나이: " + avg); // 32.0

		// stream
		System.out.println("IntStream, average 사용###");
		avg = list.stream()
				.mapToInt(m -> m.getAge())
				.average()
				.getAsDouble();
		System.out.println("평균나이: " + avg); // 32.0
		
		System.out.println("stream, collect 사용###");
		avg = list.stream()
				.collect(Collectors.averagingDouble(Member::getAge));
		System.out.println("평균나이: " + avg);
	}
}

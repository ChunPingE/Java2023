package ch17.sec06.exam01;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {
		// List컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("홍길동", 92));
		studentList.add(new Student("홍길동", 87));

		// Student를 score 스트림으로 변환
		studentList.stream()
				.mapToInt(s -> s.getScore())
				.forEach(score -> System.out.println(score));

		int max = studentList.stream()
				.mapToInt(s -> s.getScore())
				.max()
				.getAsInt();

		int min = studentList.stream()
				.mapToInt(s -> s.getScore())
				.min()
				.getAsInt();

		int sum = studentList.stream()
				.mapToInt(s -> s.getScore())
				.sum();

		double avg = studentList.stream()
				.mapToInt(s -> s.getScore())
				.average()
				.getAsDouble();

		System.out.printf("최대점수: %d, 최소점수: %d, 총합: %d, 평균: %f\n", max, min, sum, avg);
		// 최대점수: 92, 최소점수: 85, 총합: 264, 평균: 88.000000

		// summaryStatistics() : 통계
		IntSummaryStatistics summary = studentList.stream()
				.mapToInt(s -> s.getScore())
				.summaryStatistics();

		System.out.println(summary);
		// IntSummaryStatistics{count=3, sum=264, min=85, average=88.000000, max=92}
	}
}

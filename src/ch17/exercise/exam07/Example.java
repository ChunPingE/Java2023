package ch17.exercise.exam07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자"));

		// 고전적 for
		System.out.println("고전 for ####");
		List<Member> devlopers1 = new ArrayList<>();
		for (Member member : list) {
			if (member.getJob().equals("개발자")) {
				devlopers1.add(member);
			}
		}

		for (Member member : devlopers1) {
			System.out.println(member.getName());
		}

		// stream
		System.out.println("stream ####");
		List<Member> devlopers2 = list.stream()
				.filter(m -> m.getJob().equals("개발자"))
				.collect(Collectors.toList());

		devlopers2.stream()
				.forEach(m -> System.out.println(m.getName()));
	}
}

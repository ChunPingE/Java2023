package ch17.exercise.exam08;

import java.util.*;

public class Example1 {
	public static void main(String[] args) {
		List<Member> list = List.of(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자"));

		Map<String, List<Member>> map = new HashMap<>();

		// code..
		for (Member member : list) {
			List<Member> val = map.get(member.getJob());

			if (val == null) {
				val = new ArrayList<>();
				map.put(member.getJob(), val);
			}
			val.add(member);
		}

		System.out.println("[개발자]");
		List<Member> dev = map.get("개발자");
		for (Member d : dev) {
			System.out.println(d);
		}
		//[개발자]
		//{name:홍길동, job:개발자}
		//{name:신용권, job:개발자}

		System.out.println();

		System.out.println("[디자이너]");
		List<Member> des = map.get("디자이너");
		for (Member d : des) {
			System.out.println(d);
		}
		//[디자이너]
		//{name:김나리, job:디자이너}
	}
}

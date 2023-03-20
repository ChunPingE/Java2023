package ch17.exercise.exam05;

import java.util.Arrays;
import java.util.List;

public class Example {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supprots lambda expressions");

		// 고전 for
		for (String s : list) {
			if (s.toLowerCase().contains("java")) {
				System.out.println(s);
			}
		}
		
		System.out.println();
		
		//stream
		list.stream()
				.filter(s -> s.toLowerCase().contains("java"))
				.forEach(s -> System.out.println(s));
	}
}

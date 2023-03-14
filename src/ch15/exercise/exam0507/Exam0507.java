package ch15.exercise.exam0507;

import java.util.List;

public class Exam0507 {
	public static void main(String[] args) {
		// int[] array = { 1, 5, 3, 8, 2 };
		// ArrayList수정가능
		// List of() 메소드 : 수정불가 리스트 리턴
		List<Integer> list = List.of(1, 5, 3, 8, 2);

		int max = Integer.MIN_VALUE;
		for (Integer i : list) {
			if (i > max) {
				max = i;
			}
		}
		System.out.println(max);
	}
}

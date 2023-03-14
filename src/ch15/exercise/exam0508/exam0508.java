package ch15.exercise.exam0508;

import java.util.List;

public class exam0508 {
	public static void main(String[] args) {
		List<List<Integer>> list = List.of(
				List.of(95, 86),
				List.of(83, 92, 96),
				List.of(78, 83, 93, 87, 88)
				);
		
		// 문제8
		// 10개값 총합, 평균
		int sum = 0;
		int count = 0;
		for (List<Integer> list2 : list) {
			for (Integer i : list2) {
				sum += i;
				count++;
			}
		}
		
		double avg = (double) sum / count;
		System.out.println(sum); //881
		System.out.println(avg); //88.1
	}
}

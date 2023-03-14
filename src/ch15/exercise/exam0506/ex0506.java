package ch15.exercise.exam0506;

import java.util.ArrayList;
import java.util.List;

public class ex0506 {
	public static void main(String[] args) {
		List<int[]> list = new ArrayList<>();
		list.add(new int[] { 95, 86 });
		list.add(new int[] { 83, 92, 96 });
		list.add(new int[] { 78, 83, 93, 87, 88 });

		System.out.println(list.size());
		System.out.println(list.get(2).length);
	}
}

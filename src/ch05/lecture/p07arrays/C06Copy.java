package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C06Copy {
	public static void main(String[] args) {
		int[][] arr1 = {
				{3,4},
				{9,8}
		};
		
		int[][] arr2 = Arrays.copyOf(arr1, arr1.length);
		
	}
}

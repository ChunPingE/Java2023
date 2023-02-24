package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C01ToString {
	public static void main(String[] args) {
		int[] arr1 = { 9, 8, 7, 1, 2 };
		
		for (int n : arr1) {
			System.out.println(n);
		}
		
		System.out.println(Arrays.toString(arr1));
	}
}

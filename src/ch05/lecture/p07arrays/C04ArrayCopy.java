package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C04ArrayCopy {
	public static void main(String[] args) {
		// 책188쪽
		int[] origin = { 9, 8, 1, 2, 3 };
		int[] target = new int[origin.length];

		//System.arraycopy(원본배열, 원본배열시작 index, 타겟배열, 타켓배열시작index, 복사할 길이);
		System.arraycopy(origin, 0, target, 0, origin.length);
	}
}

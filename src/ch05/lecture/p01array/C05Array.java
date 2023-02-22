package ch05.lecture.p01array;

public class C05Array {
	public static void main(String[] args) {
		// 타입선언시 초기값 할당할때 new 타입명 생략가능
		int[] arr5 = { 3, 4, 5 };

		int[] arr6;
		// arr6 = {3,4,5}; 문법오류
		arr6 = new int[] { 3, 4, 5 };

	}

}

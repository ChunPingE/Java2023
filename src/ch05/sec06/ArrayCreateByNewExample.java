package ch05.sec06;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		// 배열 변수 선언과 배열생성
		int[] arr1 = new int[3];

		// 배열 항목의 초기값 출력
		for (int i = 0; i < 3; i++) {
			System.out.printf("arr1[%d]: %d,", i, arr1[i]);
		}
		//arr1[0]: 0,arr1[1]: 0,arr1[2]: 0,
		System.out.println();

		// 배열 항목의 값 변경
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		// 배열항목 변경값 출력
		for (int i = 0; i < 3; i++) {
			System.out.printf("arr1[%d]: %d,", i, arr1[i]);
		}
		// arr1[0]: 10,arr1[1]: 20,arr1[2]: 30,
		System.out.println("\n");

		// 배열 변수선언과 배열생성
		double[] arr2 = new double[3];
		// 배열 항목의 초기값 출력
		for (int i = 0; i < 3; i++) {
			System.out.printf("arr2[%d]: %f,", i, arr2[i]);
		}
		// arr2[0]: 0.000000,arr2[1]: 0.000000,arr2[2]: 0.000000,
		System.out.println();
		// 배열 항목의 값 변경
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		// 배열항목 변경값 출력
		for (int i = 0; i < 3; i++) {
			System.out.printf("arr2[%d]: %f,", i, arr2[i]);
		}
		// arr2[0]: 0.100000,arr2[1]: 0.200000,arr2[2]: 0.300000,
		System.out.println("\n");

		// 배열 변수선언과 배열생성
		String[] arr3 = new String[3];
		// 배열 항목의 초기값 출력
		for (int i = 0; i < 3; i++) {
			System.out.printf("arr3[%d]: %s,", i, arr3[i]);
		}
		// arr3[0]: null,arr3[1]: null,arr3[2]: null,
		System.out.println();
		// 배열 항목의 값 변경
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		// 배열항목 변경값 출력
		for (int i = 0; i < 3; i++) {
			System.out.printf("arr3[%d]: %s,", i, arr3[i]);
		}
		// arr3[0]: 1월,arr3[1]: 2월,arr3[2]: 3월,
	}
}

package ch05.lecture.p01array;


public class C06Array {
	public static void main(String[] args) {
		// 배열의 길이
		int[] arr1 = { 3, 4, 5 };
		
		int len = arr1.length; //배열의 길이를 알 수있는 필드, property 
		
		for (int i = 0; i < len; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}

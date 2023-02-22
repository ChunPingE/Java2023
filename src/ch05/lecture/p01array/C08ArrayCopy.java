package ch05.lecture.p01array;

public class C08ArrayCopy {
	public static void main(String[] args) {
		int[] arr1 = { 3, 4, 5 };
		//arr1[3] = 9; 실행중오류(runtime exception);
		
		int[] arr2 = {10,20,30};
		int[] arr3 = new int[arr2.length];
		
		for (int i = 0; i < arr2.length; i++) {
			arr3[i] = arr2[i];
		}
		
		System.out.println(arr2[0]); //10
		System.out.println(arr3[0]); //10
		
		arr2[0] = 100;
		
		System.out.println(arr2[0]); //100
		System.out.println(arr3[0]); //10
	}
}

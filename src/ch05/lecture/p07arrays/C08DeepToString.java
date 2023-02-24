package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C08DeepToString {
	public static void main(String[] args) {
		int[] arr1 = {5,2,1,0};
		
		System.out.println(Arrays.toString(arr1));
		
		int[][] arr2= {
				{7,8},
				{2,3}
		};
		
		System.out.println(Arrays.toString(arr2));
		//[[I@5ca881b5, [I@24d46ca6] == arr2[0] arr2[1]을 그냥보여준것임.
		
		System.out.println("for loop로 toString");
		for (int[] arr : arr2) {
			System.out.println(Arrays.toString(arr));
		} //[7, 8] [2, 3]
		
		System.out.println("deepToString 메소드 사용");
		System.out.println(Arrays.deepToString(arr2)); //[[7, 8], [2, 3]]
	}
}











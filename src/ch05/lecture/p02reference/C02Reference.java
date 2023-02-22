package ch05.lecture.p02reference;

public class C02Reference {
	public static void main(String[] args) {
		int a = 3;
		int b = a;

		System.out.println(a); // 3
		System.out.println(b); // 3

		a = 6;

		System.out.println(a); // 6
		System.out.println(b); // 3

		int[] arr1 = { 5, 6, 7 };
		int[] arr2 = arr1;
		
		arr1[0] = 99;

	}

}

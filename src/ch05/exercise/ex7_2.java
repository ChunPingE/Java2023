package ch05.exercise;

public class ex7_2 {
	public static void main(String[] args) {
		int[] array = {1,5,3,8,2};
		int max = array[0];
		for (int n: array) {
			if (n>max) {
				max = n;
			}
		}
		System.out.println(max);
	}
}

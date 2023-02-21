package ch04.exercise;

public class ex3_2 {
	public static void main(String[] args) {
		// 1~ 100 까지 3의 배수의 총합
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum); //1683
	}
}

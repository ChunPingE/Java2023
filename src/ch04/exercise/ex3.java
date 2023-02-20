package ch04.exercise;

public class ex3 {
	public static void main(String[] args) {
		// 1~ 100 까지 3의 배수의 총합
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			if (i % 3 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum); //1683
	}
}

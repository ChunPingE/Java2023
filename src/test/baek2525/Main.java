package test.baek2525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();

		if (B + C < 60) {
			System.out.printf("%d %d", A, B+C);
		} else {
			System.out.printf("%d %d", A+((B+C)/60)>=24?A+((B+C)/60)-24:A+((B+C)/60), (B+C)%60);
		}
	

	}

}

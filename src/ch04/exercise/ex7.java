package ch04.exercise;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		int balance = 0;
		boolean stop = false;

		Scanner sc = new Scanner(System.in);

		while (!stop) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");

			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				System.out.print("예금액> ");
				balance += Integer.parseInt(sc.nextLine());
				break;
			case "2":
				System.out.print("출금액> ");
				balance -= Integer.parseInt(sc.nextLine());
				break;
			case "3":
				System.out.print("잔고> ");
				System.out.println(balance);
				break;
			case "4":
				System.out.print("프로그램 종료");
				stop = true;
				break;
			}
		}
	}
}

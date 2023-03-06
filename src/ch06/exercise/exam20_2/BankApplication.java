package ch06.exercise.exam20_2;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		AccountList list = new AccountList();

		while (true) {

			int menu = mainmenu();

			switch (menu) {
			case 1:
				list.createAccount();
				break;
			case 2:
				list.AcList();
				break;
			case 3:
				list.depoist();
				break;
			case 4:
				list.withdraw();
				break;
			case 5:
				quit();
				break;
			}
		}
	}

	public static int mainmenu() {
		Scanner sc = new Scanner(System.in);

		System.out.println("--------------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("--------------------------------------------------");
		System.out.print("선택> ");
		int menu = Integer.parseInt(sc.nextLine());

		return menu;
	}

	public static void quit() {
		System.out.println("프로그램 종료");
		System.exit(0);
	}
}

package ch15.exercise.exam0620;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ch06.exercise.exam20_2.Account;

public class BankApplication {
	private static List<Account> list = new ArrayList<>();

	public static void main(String[] args) {

		while (true) {

			int menu = mainmenu();

			switch (menu) {
			case 1:
				createAccount();
				break;
			case 2:
				AccountList();
				break;
			case 3:
				depoist();
				break;
			case 4:
				withdraw();
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

	public static void createAccount() {
		Scanner sc = new Scanner(System.in);

		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");

		System.out.print("계좌번호: ");
		String ano = sc.nextLine();

		System.out.print("계좌주: ");
		String owner = sc.nextLine();

		System.out.print("초기입금액: ");
		int balance = Integer.parseInt(sc.nextLine());

		Account newAccount = new Account(ano, owner, balance);
		list.add(newAccount);
		System.out.println("결과: 계좌가 생성되었습니다.");
	}

	public static void AccountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");

		for (int i = 0; i < list.size(); i++) {
			Account account = list.get(i);
			if (account != null) {
				String ano = account.getAno();
				String owner = account.getOwner();
				int balance = account.getBalance();
				System.out.printf("%s     %s     %d\n", ano, owner, balance);
			}
		}
	}

	public static void depoist() {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = sc.nextLine();
		System.out.print("예금액: ");
		int balance = Integer.parseInt(sc.nextLine());

		// 입력된 계좌번호를 가진 Account 객체 찾아서
		for (int i = 0; i < list.size(); i++) {
			Account cur = list.get(i);

			if (cur.getAno().equals(ano)) {
				// 입력 받은 금액을 더해서 다시 넣어준다(set)
				int money = cur.getBalance() + balance;
				cur.setBalance(money);
			}
		}
	}

	public static void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = sc.nextLine();
		System.out.print("출금액: ");
		int money = Integer.parseInt(sc.nextLine());

		// 입력된 계좌번호를 가진 Account 객체 찾아서
		for (int i = 0; i < list.size(); i++) {
			Account cur = list.get(i);

			if (cur.getAno().equals(ano)) {
				if (cur.getBalance() < money) {
					System.out.println("잔액이 부족합니다.");
					return;
				} else {
					// 입력 받은 금액을 빼고 돌려주기(set)
					int balance = cur.getBalance() - money;
					cur.setBalance(balance);
				}
			}
		}
	}

	public static void quit() {
		System.out.println("프로그램 종료");
		System.exit(0);
	}
}

package ch06.exercise.exam20_2;

import java.util.Scanner;

public class AccountList {
	Account[] account;
	int current;
	
	public AccountList() {
		account = new Account[100];
		current = 0;
	}
	
	public void createAccount() {
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

		Account newAccount = new Account();
		newAccount.setAno(ano);
		newAccount.setOwner(owner);
		newAccount.setBalance(balance);

		this.account[this.current] = newAccount;
		this.current++;
		
		System.out.println("결과: 계좌가 생성되었습니다.");
	}

	public void AcList() {
		Account[] account = this.account;
		int numOfAccounts = this.current;
		
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");

		for (int i = 0; i < numOfAccounts; i++) {
			System.out.printf("%7s%10s%10d%n", account[i].getAno(), account[i].getOwner(),
					account[i].getBalance());
		}
	}

	public void depoist() {
		Account[] account = this.account;
		int numOfAccounts = this.current;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = sc.nextLine();
		System.out.print("예금액: ");
		int balance = Integer.parseInt(sc.nextLine());

		// 입력된 계좌번호를 가진 Account 객체 찾아서
		for (int i = 0; i < numOfAccounts; i++) {
			Account cur = account[i];

			if (cur.getAno().equals(ano)) {
				// 입력 받은 금액을 더해서 다시 넣어준다(set)
				int money = cur.getBalance() + balance;
				cur.setBalance(money);
			}
		}
	}

	public void withdraw() {
		Account[] account = this.account;
		int numOfAccounts = this.current;
		Scanner sc = new Scanner(System.in);
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = sc.nextLine();
		System.out.print("출금액: ");
		int money = Integer.parseInt(sc.nextLine());

		// 입력된 계좌번호를 가진 Account 객체 찾아서
		for (int i = 0; i < numOfAccounts; i++) {
			Account cur = account[i];

			if (cur.getAno().equals(ano)) {
				int money1 = cur.getBalance() - money;
				cur.setBalance(money1);
			}
		}
	}
}

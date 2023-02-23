package ch05.exercise;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		int stNum = 0;
		int[] scores = null;
		boolean run = true;

		while (run) {

			int menu = mainMenu();

			switch (menu) {
			case 1:
				stNum = inputNum();
				scores = new int[stNum];
				break;
			case 2:
				input(scores);
				break;
			case 3:
				list(scores);
				break;
			case 4:
				analyse(scores);
				break;
			case 5:
				run = quit();
				break;
			}
		}
	}

	public static int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4.분석 | 5.종료");
		System.out.println("-------------------------------------------------------");
		System.out.print("선택> ");
		int memuNum = Integer.parseInt(sc.nextLine());
		return memuNum;
	}

	public static int inputNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수> ");
		int stNum = Integer.parseInt(sc.nextLine());
		return stNum;
	}

	public static void input(int[] scores) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d]> ", i);
			scores[i] = Integer.parseInt(sc.nextLine());
		}
	}

	public static void list(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("scores[%d]: %d\n", i, scores[i]);
		}
	}

	public static void analyse(int[] scores) {
		int total = 0;
		double avg = 0;
		int max = 0;

		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}
			total += scores[i];
		}
		avg = (double) total / scores.length;
		System.out.println("최고 점수: " + max);
		System.out.println("평균 점수: " + avg);
	}

	public static boolean quit() {
		System.out.println("프로그램 종료");
		return false;
	}
}

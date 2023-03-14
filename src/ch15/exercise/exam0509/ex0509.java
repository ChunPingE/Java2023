package ch15.exercise.exam0509;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex0509 {
	public static void main(String[] args) {
		int stNum = 0;
		// int[] scores = null;
		boolean run = true;
		List<Integer> scores = new ArrayList<>();
		while (run) {

			int menu = mainMenu();

			switch (menu) {
			case 1:
				stNum = inputNum();
				break;
			case 2:
				input(scores, stNum);
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

	public static void input(List<Integer> scores, int stNum) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < stNum; i++) {
			System.out.printf("scores[%d]> ", i);
			scores.add(Integer.parseInt(sc.nextLine()));
		}
	}

	public static void list(List<Integer> scores) {
		for (int i = 0; i < scores.size(); i++) {
			System.out.printf("scores[%d]: %d\n", i, scores.get(i));
		}
	}

	public static void analyse(List<Integer> scores) {
		int total = 0;
		double avg = 0;
		int max = 0;

		for (int i = 0; i < scores.size(); i++) {
			if (scores.get(i) > max) {
				max = scores.get(i);
			}
			total += scores.get(i);
		}
		avg = (double) total / scores.size();
		System.out.println("최고 점수: " + max);
		System.out.println("평균 점수: " + avg);
	}

	public static boolean quit() {
		System.out.println("프로그램 종료");
		return false;
	}
}

package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C04Scanner {
	public static void main(String[] args) {
		String input = "3 33 555 50";
		Scanner sc = new Scanner(input);
		
		int num1 = sc.nextInt();
		System.out.println(num1); //3
		System.out.println(sc.nextInt()); //33
		System.out.println(sc.nextInt()); //555
		System.out.println(sc.nextInt()); //50
		
		

	}
}

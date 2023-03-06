package ch07.lecture.p02polymorphism;

import java.util.Scanner;

public class C03Polymorphism {
	public static void main(String[] args) {
		String s1 = "hello";
		Object o1 = s1;
		
		Object o2 = "java";
		
		char c1 = s1.charAt(0);
		// o1.charAt(0); 불가능
		
		Scanner sc1 = new Scanner("");
		Object o3 = sc1;
		sc1.nextLine();
		//o3.nextLine(); 불가능
	}
}


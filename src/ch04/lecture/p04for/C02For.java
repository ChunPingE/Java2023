package ch04.lecture.p04for;

public class C02For {
	public static void main(String[] args) {
		// 변수의 scope
		int i = 0;
		while (i<3) {
			System.out.println("while loop");
			i++;
		}
		
		int j = 0;
		for (j = 0; j < 3; j++) {
			System.out.println("for loop");
		}
	}
}

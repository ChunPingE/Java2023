package ch04.lecture.p03whle;

public class C02While {
	public static void main(String[] args) {

		System.out.println("이전 실행문..");

		int i = 0;
		boolean con = true;
		while (i < 3) {
			System.out.println("세번만 실행하고 싶다.");
			i++;
		}
		System.out.println("다음 실행문..");
	}
}

package ch04.lecture.p01if;

public class C04Random {
	public static void main(String[] args) {
		// Math.random()
		// 0 <= Math.random() < 1의 double값 리턴

		// ex. 0,1,2
		int res1 = (int) (Math.random() * 3);

		System.out.println(res1);

		// ex 1,2,3
		int res2 = ((int) (Math.random() * 3)) + 1;

		System.out.println(res2);

		// 로또 번호 1~45
		int res3 = (int) (Math.random() * 45) + 1;

		System.out.println(res3);
	}
}

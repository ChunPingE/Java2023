package ch04.exercise;

public class ex5_2 {
	public static void main(String[] args) {
		outerLoop: for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if ((4 * x) + (5 * y) == 60) {
					System.out.printf("(%d, %d)\n", x, y);
					break outerLoop;
				}
			}
		}
	}
}

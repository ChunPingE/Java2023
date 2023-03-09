package ch12.lecture.p04system;

public class C02System {
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			int r = 3 * 5;
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}
}

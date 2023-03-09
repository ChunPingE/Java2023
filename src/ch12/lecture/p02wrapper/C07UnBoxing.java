package ch12.lecture.p02wrapper;

public class C07UnBoxing {
	public static void main(String[] args) {
		Integer i1 = 30000; // autoboxing
		int r1 = i1 + 50000; // unboxing

		System.out.println(r1);

		Object o1 = 30000; // autoBoxing, type conversion
		// int r2 = o1 + 50000; //불가능 integer는 object가 아니기때문

		int r3 = ((Integer) o1) + 50000;
		
		int r4 = ((int) o1) + 50000;

	}
}

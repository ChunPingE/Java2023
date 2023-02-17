package ch03.lecture.p04logical;

public class C04ShortCirtcuit {
	public static void main(String[] args) {
		// ||
		// true || true : true
		// true || false : true
		// false || true : true
		// false || false : false
		// 앞이 true이면 뒤까지보고 연산하고
		// 앞에가 false이면 뒤를 보지않고 false라고 연산결과를 리턴한다.
		
		int x = 10;
		if (x++ > 0 || x++ < 100) {
			System.out.println("실행됨1");
		}
		System.out.println(x); //x = 11
		
		x = 10;
		if (x++ > 0 || x++ < 5) {
			System.out.println("실행됨2");
		}
		System.out.println(x); //x = 11
		
		x = 10;
		if (x++ < 0 || x++ < 100) {
			System.out.println("실행됨3");
		}
		System.out.println(x); //x = 12
		
		x = 10;
		if (x++ < 0 || x++ > 100) {
			System.out.println("실행됨4");
		}
		System.out.println(x); //x = 12
		
		x = 10;
		if (x++ < 0 | x++ < 100) {
			System.out.println("실행됨5");
		}
		System.out.println(x); //x = 12
		
		x = 10;
		if (x++ < 0 | x++ > 100) {
			System.out.println("실행됨6");
		}
		System.out.println(x); //x = 12
		
		
	}
}

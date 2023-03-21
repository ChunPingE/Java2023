package ch11.lecture.p04throw;

public class C04Throw {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void method1() {
		throw new RuntimeException();
	}
}

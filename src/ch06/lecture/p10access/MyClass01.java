package ch06.lecture.p10access;

public class MyClass01 {
	// 접근제한자(acecess modifier)
	// public : 어디서든지 접근가능
	// private : 작성한 클래스 내에서만 접근가능

	// 필드
	public String name;
	private int age;

	// 메소드
	public void method1() {
		System.out.println("메소드1");
	}

	private void method2() {
		System.out.println("메소드2");
	}

	public void method3() {
		System.out.println(age);
	}

	public void method4() {
		method2();
	}
}

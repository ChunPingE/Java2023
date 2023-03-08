package ch08.lecture.p04etc;

public class MyClass012 implements MyInterface01 {

	@Override
	public void method1() {
		System.out.println("MyClass012 override");
	}

	@Override
	public void method2() {
		System.out.println("MyClass012에서 default 메소드 method2 재정의");
	}

}

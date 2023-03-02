package ch06.sec13.exam03.package1;

public class B {
	public void method() {
		//객체 생성
		A a = new A();
		
		//필드값변경
		a.field1 = 1; //o
		a.field2 = 1; //o
		//a.field3 = 1; //x private필드 접근 불가
		
		//메소드 호출
		a.method1();
		a.method2();
		//a.method3(); private메소드 접근 불가
	}
}

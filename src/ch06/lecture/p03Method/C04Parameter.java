package ch06.lecture.p03Method;

public class C04Parameter {
	public static void main(String[] args) {
		//메소드 실행시 정의된 파라미터의 타입과 순서, 개수에 맞춰서 아규먼트 입력(전달)해야한다.
		MyClass04 o1 = new MyClass04();
		o1.method1();
		//o1.method1(3); 불가능 
		
		o1.method2(5);
		//	o1.method2();불가능
		
		o1.method3("hello");
		
		//method4~7 호출코드작성
		o1.method4(1, 2);
		
		o1.method5("hello", "world");
		
		o1.method6(1, "hello");
		
		o1.method7("hello", 3);
	}
}

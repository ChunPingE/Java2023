package ch06.lecture.p03Method;

public class C05Parameter {
	public static void main(String[] args) {
		// 메소드 실행시 정의된 파라미터의 타입과 순서, 개수에 맞춰서 아규먼트 입력(전달)해야한다.
		MyClass05 o1 = new MyClass05();
		
		o1.method2(10, 20);
		o1.method2(30, 50);
		
		o1.method3(5);
		o1.method3(10);
	}
}

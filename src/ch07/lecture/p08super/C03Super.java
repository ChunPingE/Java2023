package ch07.lecture.p08super;

public class C03Super {
	public static void main(String[] args) {
		
	}
}

class Super03 {
	public Super03(int i) {
		
	}
}

class Sub03 extends Super03 {
	public Sub03() {
		//자동으로 삽입되는 상위클래스 기본생성자 호출코드는 동작하지 않음
		//super(); 
		//따라서 명시적 호출 필요
		super(3);
	}
}

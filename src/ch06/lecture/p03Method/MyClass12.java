package ch06.lecture.p03Method;

public class MyClass12 {
	int method1() {
		// 1.메소드 종료
		// 2.오른쪽 값을 호출한 곳으로 return(반환)
		// 오른쪽값은 메소드 리턴타입과 일치해야한다.
		return 3;
	}

	int method2() {
		// 메소드에 리턴타입을 명시하면
		// 해당 타입의 값을 꼭 리턴해야한다.

		return 3;
	}

	int method3() {
		int a = 3;
		return a;
	}
	
	/*
	int method4() {
		long a = 3L;
		return a;
	}
	 */
	
	int method5() {
		short a = 6000;
		return a; //자동형변환
	}
	
	//리턴이 없으면 void로 리턴타입 명시
	void method8() {
		
		return; //만약 쓴다면 메소드 종료 역할로만 사용가능
	}

}

package ch06.lecture.p08static;

public class MyClass01 {
	//인스턴스 필드
	String name;
	
	//정적필드
	static String company;
	
	// 생성자 : 인스턴스 필드 초기화(주로)
	MyClass01() {
		name = "son";
	}
	
	//static block : 정적 필드 초기화(주로)
	//static initialization block 정적 초기화 블록
	static {
		//명령문들
		company = "samsung";
	}

}

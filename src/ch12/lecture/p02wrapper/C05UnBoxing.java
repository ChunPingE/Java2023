package ch12.lecture.p02wrapper;

public class C05UnBoxing {
	public static void main(String[] args) {
		Integer i1 = 30; // auto boxing
		
		int i2 = 50;
		
		//기본타입과 참조타입의 산술연산이 하고싶다.
		int i3 = i1 * i2; //지금버전
		int i4 = i1.intValue() * i2; //예전버전
		
		int i5 = i1.intValue(); //unboixng
		int i6 = i1; // auto unbo
		
	}
}

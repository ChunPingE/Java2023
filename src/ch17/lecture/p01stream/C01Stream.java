package ch17.lecture.p01stream;

import java.util.stream.Stream;

public class C01Stream {
	public static void main(String[] args) {
		// 여러 원소(element)의
		// 순차적 처리 기능(메소드)을 제공하는 클래스, 인터페이스
		
		//스트림 만들기
		Stream<Integer> stream1 = Stream.of(5, 1, 3, 9, 10, 0);
	
		//스트림 메소드 (연산) 
		//1.최종연산(terminal operation)
		//리턴타입 : Stream이아님.
		//최종연산시 중간연산도 같이 실행됨
		
		//개수 세기(count)
		stream1.count();
		stream1.findFirst();
		
		//2.중간연산(intermediate operation)
		//리턴타입 : Stream
	}
}

package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		Set<Member> set = new HashSet<>();
		
		//Member객체 생성
		//재정의했기때문에 동등객체로 판단한다.
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		//저장된 객체 수 출력
		System.out.println("총 객체 수: " + set.size()); //총 객체 수: 1
	}
}

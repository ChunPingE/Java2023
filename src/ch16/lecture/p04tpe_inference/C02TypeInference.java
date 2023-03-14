package ch16.lecture.p04tpe_inference;

import java.util.ArrayList;

public class C02TypeInference {
	public static void main(String[] args) {
		// 지역변수 타입추론
		// var 사용
		// 선언과 동시에 초기화할때만 사용가능하다.
		int a = 3;
		String b = "java";

		var c = 5;
		var d = "hello";
		
		//var = e;
		//e = 9; 불가능
		
		Box<String> box1 = new Box<>();
		var box3 = new Box<String>();
		
		//재할당시 같은 타입만 가능
		var f = 10;
		f = 11;
		//f = 12.0; 불가능
		
		// var사용시 읽기 쉬운 코드인가?? 를 고민해야한다.
		var list2 = new ArrayList<String>();
		
		//긴코드..
		for (String item : list2) {
		}
		
		// 권장하지 않음
		for (var item : list2) {
		}
		
		//var는 키워드가 아니다.
		int var = 3; // 사용가능하지만 사용하지 말자
		
		
		
		
		
		
		
		
		
		
		
		
			
	}
}

package ch02.lecture.p02type;

public class C08Double {
	public static void main(String[] args) {
		//실수
		//float(4 bytes), double(8 bytes)
		
		int i1 = 3;
		//i1 = 3.14; 불가능
		
		double d1 = 3.14;
		d1 = 99.9999;
		d1 = 3;
		d1 = 99;
		
		float f1 = 3.14F; // F, f 끝문자로 float literal 표현
		f1 = 3; //얘는 정수라 됨.
		f1 = 3.0f;

		// 사용시 주의
		//컴퓨터는 10진법을 2진법으로 바꿔서 저장함
		//10진법으로는 딱 떨어지는 값을 2진법으로는 떨어지게 못하는 경우가 있다.
		double d2 = 0.1; 
		double d3 = 0.2;
		
		double d4 = d2 + d3;
		System.out.println(d4);
		
		
	}

}

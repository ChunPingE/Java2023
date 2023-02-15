package ch02.lecture.p02type;

public class C12Casting {
	public static void main(String[] args) {
		//정수끼리, 실수끼리
		//큰타입 -> 작은타입 : 강제 형 변환(casting)
		int i1;
		long l1;
		
		l1 = 30;
		i1 = (int) l1; // 강제 형 변환(casting 연산)
		//int로 표현이 가능하더라도 bytes수가 달라서 오류가 발생한다.
		
		l1 = 3000000000L;
		i1 = (int) l1;
		System.out.println(l1); //3000000000
		System.out.println(i1); //-1294967296
		
		short s1 = 200; //2진수 0000 0000 1100 1000
		byte b1 = (byte) s1; 
		System.out.println(s1); 
		System.out.println(b1); //-56 앞을 잃어버리고 1100 1000
		
		// 실수 -> 정수 : 강제 형변환(casting)
		double d2;
		int i2;
		
		d2 = 3.14;
		i2 = (int) d2; //강제형변환 소수점 아래 버려짐.
		System.out.println(d2); //3.14
		System.out.println(i2); //3
		
	}

}

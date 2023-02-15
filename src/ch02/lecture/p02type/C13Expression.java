package ch02.lecture.p02type;

public class C13Expression {
	public static void main(String[] args) {
		// 연산 중 자동 형 변환
		byte b1 = 30;
		byte b2 = 10;

		// byte short int의 연산결과는 int
		// byte b3 = b1 + b2;
		int i3 = b1 + b2;
		byte b4 = (byte) (b1 + b2);

		byte b5 = 30 + 10; // 리터럴은 그냥 그대로 되서 됨

		// 정수간의 연산에서 long이 포함된 연산의 결과는 long이다.
		long l6 = 30;
		long l7 = 10;
		// int i6 = l6 + l7; 불가능
		long l8 = l6 + l7;

		int i9 = 20;
		// int i10 = i9 + l7; 불가능
		long l10 = i9 + l7;

		int i10 = (int) (i9 + l7);
		
		//정수와 실수끼리 연산 결과는 실수
		int i11 = 30;
		double d11 = 3.14;
		
		double d12 = i11 + d11;
		
	

	}

}

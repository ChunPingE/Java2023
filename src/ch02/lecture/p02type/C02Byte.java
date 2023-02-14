package ch02.lecture.p02type;

public class C02Byte {
	public static void main(String[] args) {
		// 정수형
		// byte (1 byte , 8bits)
		// 가장 작은 값 : 00000000 (0)
		// 가장 큰 값 : 1111111 (255)
		// 음수 표현하기 위해 맨앞 0이면 0혹은 양수 1이면 음수
		// 가장 작은 값 10000000 (-128)
		// 가장 큰 값 01111111(127)
		
		byte b1;
		b1 = -128;
		b1 = 127;
		
		//b1 = -129; 불가능
		//b1 = 128; 불가능

		// short (2 bytes, 16bits)
		// int (4 bytes, 32bits)
		// long (8 bytes, 64bits)
	}

}

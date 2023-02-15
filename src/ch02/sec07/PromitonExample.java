package ch02.sec07;

public class PromitonExample {

	public static void main(String[] args) {
		//자동타입변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100L;
		float flaotValue = longValue;
		System.out.println("flaotValue: " + flaotValue);
		
		flaotValue = 100.5f;
		double doubleValue = flaotValue;
		System.out.println("doubleValue: " + doubleValue);
	}

}

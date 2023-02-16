package ch03.lecture.p01arithmetic;

public class C04Overflow {
	public static void main(String[] args) {
		//int a = 1500000000;
		//int b = 1700000000;
		long a = 1500000000;
		long b = 1700000000;

		System.out.println(a); //1500000000
		System.out.println(b); //1700000000

		// overflow : 타입의 최대 허용값 벗어남
		//int c = a + b;
		long c = a + b;
		System.out.println(c); //-1094967296 
		//Integer가 21억까지 표현가능하기때문임
		
		int d = -1500000000;
		int e = -1700000000;
		
		System.out.println(d); //-1500000000
		System.out.println(e); //-1700000000
		
		//underflow: 타입의 최소 값 벗어남
		int f = d + e;
		System.out.println(f); //1094967296

		

	}
}

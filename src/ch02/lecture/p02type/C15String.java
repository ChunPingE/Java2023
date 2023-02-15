package ch02.lecture.p02type;

public class C15String {
	public static void main(String[] args) {
		// String과 기본 타입간의 연산
		// +이외에 안된다.
		String s1 = "3";
		String s2 = "4";
		// System.out.println(s1 * s2); 안됨

		// + : 연결연산(concatenate)
		int i3 = 3;
		String s3 = "4";
		String r3 = i3 + s3; // 연산결과가 String
		System.out.println(r3); // 3 + "4" = "34"
		System.out.println(3.14 + "hello");
		System.out.println(false + "hi");
		
		System.out.println(3 + 3 + "4"); 
		//연산자 우선순위에 따라 3+3= 6 +"4" = "64"
		
		//기본타입 -> 스트링
		//valueOf
		//연결연산
		int i6 = 99;
		String s6 = String.valueOf(i6);
		String s7 = i6 + "";
		
		System.out.println(s6); //"99"
		System.out.println(s7); //"99"
		

	}
}

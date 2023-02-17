package ch03.lecture.p06String;

public class C05contains {
	public static void main(String[] args) {
		// contains
		// 특정 문자열이 있는지 확인
		// return type : boolean

		String str1 = """
				동해물과 백두산이
				마르고 닳도록
				""";

		boolean res1 = str1.contains("해물");
		System.out.println(res1); //true
		
		boolean res2 = str1.contains("해산물");
		System.out.println(res2); //false
	}
}

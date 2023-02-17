package ch03.lecture.p06String;

public class C03CharAt {
	public static void main(String[] args) {
		// charAt(index)
		// 특정 위치 (index)에 있는 문자 확인 index는 0부터 시작
		// return type : chsr

		String str1 = "spring";

		System.out.println("길이: " + str1.length()); // 6

		char c1 = str1.charAt(0);
		System.out.println(c1);// 's'
		System.out.println(str1.charAt(1)); // 'p'
		System.out.println(str1.charAt(2)); // 'r'
		System.out.println(str1.charAt(5)); // 'g'
		System.out.println(str1.charAt(str1.length() - 1)); 
	}
}

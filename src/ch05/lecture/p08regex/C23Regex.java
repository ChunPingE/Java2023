package ch05.lecture.p08regex;

public class C23Regex {
	public static void main(String[] args) {
		// . (모든문자)
		// \\. (.)
		
		String pattern1 = ".";
		String pattern2 = "\\.";
		
		//영대소문자 여러개 .com으로 끝나는지?
		String pattern3 = "[a-zA-Z]+\\.com";
		System.out.println("daum.com".matches(pattern3)); //true
		System.out.println("daum.net".matches(pattern3)); //false
		System.out.println("daumcom".matches(pattern3)); //fasle
	}
}

package ch05.lecture.p08regex;

public class C16Regex {
	public static void main(String[] args) {
		//0개 또는 1개 {0,1}
		// ?  : 0개 또는 1개
		
		String pattern1 = "[0-9]{0,1}";
		String pattern2 = "[0-9]?";
		
		System.out.println("1".matches(pattern1)); //true
		System.out.println("1".matches(pattern2)); //true
		
		System.out.println("123".matches(pattern1)); //false
		System.out.println("123".matches(pattern2)); //false
	}
}

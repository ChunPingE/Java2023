package ch05.lecture.p08regex;

public class C14Regex {
	public static void main(String[] args) {
		//1개이상 {1, }
		// +
		
		String pattern1 = "[a-z]{1,}";
		String pattern2 = "[a-z]+";
		
		System.out.println("abc".matches(pattern1)); //true
		System.out.println("abc".matches(pattern2)); //true
	}
}

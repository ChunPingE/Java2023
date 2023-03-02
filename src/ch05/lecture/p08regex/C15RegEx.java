package ch05.lecture.p08regex;

public class C15RegEx {
	public static void main(String[] args) {
		//0개이상 {0, }
		// *  : 0개이상
		
		String pattern1 = "[0-9]{0,}";
		String pattern2 = "[0-9]*";
		
		System.out.println("123".matches(pattern1)); //true
		System.out.println("123".matches(pattern2)); //true
	}
}

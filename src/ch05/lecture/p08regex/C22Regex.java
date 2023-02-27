package ch05.lecture.p08regex;

public class C22Regex {
	public static void main(String[] args) {
		//모든문자
		//Any character(may or may not match line terminators)
		// .
		
		String partern1 = ".";
		
		System.out.println("a".matches(partern1)); //true
		System.out.println("Z".matches(partern1)); //true
		System.out.println(" ".matches(partern1)); //true
		System.out.println("\n".matches(partern1)); //false
		
		//어떤문자든 3개
		String pattern2 = ".{3}";
		System.out.println("가나다".matches(pattern2)); //true
		System.out.println("   ".matches(pattern2)); //true
		System.out.println("가 a".matches(pattern2)); //ture
		
	}
}

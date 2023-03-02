package ch05.lecture.p08regex;

public class C13RegEx {
	public static void main(String[] args) {
		//n개 이상 : {n,}
		
		//숫자 두개이상
		String pattern = "[0-9]{2,}";
		
		System.out.println("09".matches(pattern)); //true
		System.out.println("123".matches(pattern)); //true
		System.out.println("2".matches(pattern)); //false
		System.out.println("a12".matches(pattern)); //false
	}
}

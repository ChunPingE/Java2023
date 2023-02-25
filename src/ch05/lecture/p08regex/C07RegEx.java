package ch05.lecture.p08regex;

public class C07RegEx {
	public static void main(String[] args) {
		//대소문자 한번에 표현
		System.out.println("a".matches("[a-zA-Z]")); //true
		System.out.println("A".matches("[a-zA-Z]")); //true
		
		System.out.println("0".matches("[0-9]")); // true
	}
}

package ch05.lecture.p08regex;

public class C06RegEx {
	public static void main(String[] args) {
		System.out.println("Az".matches("[A-Z][a-z]")); //true
		
		System.out.println("zA".matches("[A-Z][a-z]")); //false
	}
}

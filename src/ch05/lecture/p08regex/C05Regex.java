package ch05.lecture.p08regex;

public class C05Regex {
	public static void main(String[] args) {
		//character class
		
		System.out.println("a".matches("[abcdefghijklmlopqrstuvwxyz]"));
		
		//범위 : -
		System.out.println("a".matches("[a-z]"));
	}
}

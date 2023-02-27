package ch05.lecture.p08regex;

public class C03Regex {
	public static void main(String[] args) {
		//character class(문자분류)
		
		//[]안에 문자를 그룹으로 묶은 것
		//분류된 문자중 하나인가?
		System.out.println("a".matches("[abc]")); //true
		System.out.println("b".matches("[abc]")); //true
		System.out.println("d".matches("[abc]")); //false
	}
}

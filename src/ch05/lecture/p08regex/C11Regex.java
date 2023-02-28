package ch05.lecture.p08regex;

public class C11Regex {
	public static void main(String[] args) {
		//010으로 시작 - 기호, 숫자4자리,-기호 숫자4자리
		
		String pattern = "010-[0-9]{4}-[0-9]{4}";
		
		System.out.println("010-9999-7777".matches(pattern)); //true
		System.out.println("010-98767777".matches(pattern)); //false
		System.out.println("010-9999-765".matches(pattern)); //false
	}
}

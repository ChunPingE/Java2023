package ch03.lecture.p06String;

public class C07Substirng {
	public static void main(String[] args) {
		// toLowerCase
		// 소문자로 바꾼 문자열 리턴
		// toUpperCase
		// 대문자로 바꾼 문자열 리턴
		// return type : String
		
		String str1 = "I'm ironMan";
		String res1 = str1.toLowerCase();
		System.out.println(res1); //i'm ironman
		
		String res2 = str1.toUpperCase();
		System.out.println(res2); //I'M IRONMAN
		
		//대소문자 구분없이 문자열 위치 확인
		String res3 = str1.toLowerCase();
		System.out.println(res3.indexOf("ir"));
		System.out.println(str1.toLowerCase().indexOf("ir")); //메소드체이닝
	
		//대소문자 구분없이 문자가 있는지
		String str4 = "lorem ipSum";
		System.out.println(str4.toLowerCase().indexOf("sum")); //메소드체이닝
	}
}

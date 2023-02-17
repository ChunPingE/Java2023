package ch03.lecture.p06String;

public class C11isBlank {
	public static void main(String[] args) {
		// isBlank()
		//공백 문자로만 있는지 확인?
		//return type : boolean
		
		String str1 = "   java   ";
		String str2 = "   ";
		String str3 = "";
		
		System.out.println(str1.isBlank()); //false
		System.out.println(str2.isBlank()); //true
		System.out.println(str3.isBlank()); //true
	}
}

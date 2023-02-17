package ch03.lecture.p06String;

public class C11Replace {
	public static void main(String[] args) {
		// replace()
		//특정 문자열을 바꿀때 사용
		//return type : String
		
		String str1 = "설악산, 백두산, 한라산";
		System.out.println(str1.replace("산", "mountain")); //설악mountain...
		
		String str3 = str1.replace("설악", "지리");
		System.out.println(str3); //지리산, ...
	}
}

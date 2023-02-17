package ch03.lecture.p06String;

public class C06toLowerCase {
	public static void main(String[] args) {
		// subStirng
		// 문자열의 일부(subString)을 리턴
		//return type : String 
		//첫번째파라미터 시작 index(포함)
		//두번째파라미터 종료 index(포함안됨)
		
		String str1 = "중국 재개방이 글로벌 인프레이션 촉발하지 않는 이유";
		String res1 = str1.substring(0,2);
		System.out.println(res1); //중국
		
		System.out.println(str1.substring(3,6)); //재개발
		
		System.out.println(str1.substring(8)); //글~
		
		//파라미터가 인덱스를 벗어나면 오류발생
	}
}

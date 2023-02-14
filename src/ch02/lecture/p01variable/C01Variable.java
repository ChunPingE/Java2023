package ch02.lecture.p01variable;

public class C01Variable {

	public static void main(String[] args) {
		//변수
		//값을 담을 수 이름이 있는 공간
		
		//변수선언
		//타입 변수명
		int age;
		double average;
		
		//변수명
		//영문대소문자, _, $, 숫자 조합으로 작성가능, 숫자로 시작하면 안됨
		//변수명 작성관습 : loewrCamelCase
		int $;
		//int _; //단독사용 불가
		int hello;
		int your_age; //관습에 따르지 않음
		int h3;
		//int 3h; 숫자시작불가
		int yourAge; //ok
		int 나이; //사용하지 말것
		
		//변수 여러개 선언가능
		int myAge, hisAge;
		
		//같은 이름의 변수 선언 불가
		int hi;
		//int hi; ->불가능
		
		//변수에 값대입(할당) : =
		hi = 3;
		int var1;
		var1 = 99;
		
		//변수 선언, 값대입 한번에 가능
		int var2 = 100;
		
		//여러개 가능
		int var3 = 20, var4=30;
		
		//값을 할당하지 않은 변수 사용불가
		//초기화하지 않은 변수 사용불가
		int var5;
		//System.out.println(var5);
	
		//변수명 작성시 어떤 값을 갖는지 알아볼 수 있게 작성
		int koreanScore;
		int ks; //이렇게 하지말자
		
		
		
		
		
		
		
		
		
		
	}

}

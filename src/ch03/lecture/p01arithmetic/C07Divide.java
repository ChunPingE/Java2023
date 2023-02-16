package ch03.lecture.p01arithmetic;

public class C07Divide {
	public static void main(String[] args) {
		//실수를 0으로 나누면 무한대 (Infinity)
		double a = 0.0;
		double b = 3.0;
		
		double c = b / a;
		
		System.out.println(c); //Infinity
		
		double d = -3.0;
		
		double e = d /a;
		
		System.out.println(e); // -Infinity
		
		//실수를 0으로 나눈 나머지 : NaN
		double f = 3.0 % 0.0; //NaN(Not A Number)
		System.out.println(f);
		
		double g = f + 1.0;
		
		//무한대인지 확인
		boolean isInfinitie1 = Double.isInfinite(c); //boolean 값으로 리턴
		System.out.println(isInfinitie1); //true
		
		//NaN인지확인
		boolean isNan = Double.isNaN(f);
		System.out.println(isNan); // true


		
		
		
		
		
	}
}

package ch05.lecture.p05null;

public class C01Null {
	public static void main(String[] args) {
		int[] arr1 = new int[] {1,2};
		arr1 = null; //참조하는 객체가 없음
		//null이라는 값으로 덮어씌운 것임
		//int[] {1,2};이 배열은 참조할 수없는 쓰레기 취급을 받게된다.
		
		//참조하는 객체 없음 실행할때 예외 발생(NullPointerException)
		int len = arr1.length; 
		int val =  arr1[0];
		
		System.out.println("실행 흐름...");
	}
}

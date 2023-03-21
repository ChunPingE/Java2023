package ch11.sec02.exam02;

public class ExceptionHandlingExample1 {
	public static void main(String[] args) {
		try {
			//ClassNotFound Exception 발생 가능 코드
			Class.forName("java.lang.String");
			System.out.println("java.lang.String가 존재합니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		try {
			//ClassNotFound Exception 발생 가능 코드
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2가 존재합니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

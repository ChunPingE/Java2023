package ch04.lecture.p05break;

public class C04Contunue {
	public static void main(String[] args) {
		//continue
		
		for (int i = 0; i < 500; i++) {
			System.out.println("실행코드:1");
			
			if (true) {
				continue;
			}
			
			System.out.println("실행코드:2"); //Dead code
		}
	}
}

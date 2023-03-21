package ch11.lecture.p02try_catch;

public class C08MultipleException {
	public static void main(String[] args) {
		try {
			//여러 exception발생가능
			
			//아래 catch블럭의 exception보다 
			//상위 타입의 exception catch 블럭을 먼저 작성할 수 없다.
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("continue");
	}
}

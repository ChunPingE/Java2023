package ch06.exercise.exam18;

public class App {
	public static void main(String[] args) {
		ShopService o1 = ShopService.getInstance();
		ShopService o2 = ShopService.getInstance();
		
		System.out.println(System.identityHashCode(o1));
		System.out.println(System.identityHashCode(o2));
		
		if (o1 == o2) {
			System.out.println("같은 ShopService 객체 입니다.");
		} else {
			System.out.println("다른 ShopService 객체 입니다.");
		}
	}
}
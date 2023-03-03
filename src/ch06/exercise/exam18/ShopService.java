package ch06.exercise.exam18;

public class ShopService {
	private static ShopService ins = new ShopService();
	
	private ShopService() {
		
	}
	
	public static ShopService getInstance() {
		
		return ins;
	}
}

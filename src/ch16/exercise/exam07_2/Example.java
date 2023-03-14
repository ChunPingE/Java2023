package ch16.exercise.exam07_2;

public class Example {
	private static int[] scores = { 10, 50, 3 };
	
	public static int maxOrMin(Operator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.apply(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		maxOrMin(new Operator() {
			@Override
			public int apply(int x, int y) {
				int result = Math.max(x, y);
				return result;
			}
		});
		//int max = maxOrMin((x, y)->Math.max(x, y));
		int max = maxOrMin(Math::max);
		System.out.println("최대값: " + max);
		
		//int min = maxOrMin((x, y)->Math.min(x, y));
		int min = maxOrMin(Math::min);
		System.out.println("최소값: " + min);
	}
}

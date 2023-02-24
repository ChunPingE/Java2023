package ch05.exercise;

public class ex8_2 {
	public static void main(String[] args) {
		int[][] array = {
				{ 95, 86 },
				{ 83, 92, 96 },
				{ 78, 83, 93, 87, 88 }
		};
		
		int totalNum = 0;
		int totalSum = 0;
		double avg = 0;
		
		for (int[] brray : array) {
			for (int n : brray) {
				totalSum += n;
				totalNum++;
			}
		}
		
		avg = (double) totalSum / totalNum;
		
		System.out.println("전체 합: " + totalSum);
		System.out.println("평균: " + avg);
	}
}

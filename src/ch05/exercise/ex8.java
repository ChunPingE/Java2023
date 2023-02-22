package ch05.exercise;

public class ex8 {
	public static void main(String[] args) {
		int[][] array = {
				{ 95, 86 },
				{ 83, 92, 96 },
				{ 78, 83, 93, 87, 88 }
		};
		
		int totalNum = 0;
		int totalSum = 0;
		double avg = 0;
		
		//전체합과 평균
		for (int i = 0; i < array.length; i++) {
			//totalNum += array[i].length;
			for (int j = 0; j < array[i].length; j++) {
				totalSum += array[i][j];
				totalNum++;
			}
		}
		
		avg = (double) totalSum / totalNum;
		
		System.out.println("전체 합: " + totalSum);
		System.out.println("평균: " + avg);
	}

}

package ch05.lecture.p03matrix;

public class C02Matrix {
	public static void main(String[] args) {
		// 2차원 배열(행렬) 열의 길이도 정하기
		int[][] mat = new int[3][4];
		
		System.out.println(mat.length); //3
		
		System.out.println(mat[0].length);//4
		System.out.println(mat[1].length);//4
		System.out.println(mat[2].length);//4
		
		System.out.println("전체탐색");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.println(mat[i][j]);
			}
		}
		
		//각원소에 값 할당
		mat[0][0] = 3;
		mat[0][1] = 5;
		//....
		mat[1][2] = 10;
		
		System.out.println("다시전체탐색");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.println(mat[i][j]);
			}
		}
	}
}

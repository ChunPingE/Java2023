package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyByForExample2 {

	public static void main(String[] args) {
		// 길이 3인 배열
		String[] oldStrArray = { "java", "array", "copy" };
		// copyOf로 배열항목 복사
		String[] newStrArray = Arrays.copyOf(oldStrArray, 5);

		for (int i = 0; i < newStrArray.length; i++) {
			if (i == newStrArray.length - 1) {
				System.out.print(newStrArray[i]);
			} else {
				System.out.print(newStrArray[i] + ", ");
			}
		}
	}
}

package ch18.lecture.p03inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class C01InputStream {
	public static void main(String[] args) {
		// InputStream
		// byte 단위 입력 스트림
		// 주요 메소드 : read

		String name = "output/test3.db";
		try (InputStream is = new FileInputStream(name)) {
			// read : 한바이트 읽기
			System.out.println(is.read()); // 20
			System.out.println(is.read()); // 30
			System.out.println(is.read()); // 40
			// 3바이트파일 4번째 에러 안남 끝에 도달
			System.out.println(is.read()); // -1
			System.out.println(is.read()); // -1
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}

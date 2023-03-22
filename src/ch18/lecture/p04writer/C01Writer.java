package ch18.lecture.p04writer;

import java.io.FileWriter;
import java.io.Writer;

public class C01Writer {
	public static void main(String[] args) {
		// Writer : 문자단위 출력 스트림
		// 주요 메소드 : write

		String fileName = "output/writer1.txt";
		try (Writer wr = new FileWriter(fileName)) {

			// write
			wr.write('a');
			wr.write('b');
			wr.write('가');
			wr.write('나');
			wr.write(9850); //U+267A 재활용모양 ♺

			wr.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("출력 완료");
	}
}

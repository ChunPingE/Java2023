package ch18.lecture.p04writer;

import java.io.FileWriter;
import java.io.Writer;

public class C02Writer {
	public static void main(String[] args) {
		String fileName = "output/writer2.txt";
		try (Writer wr = new FileWriter(fileName)) {

			char[] data = { '가', '나', '다', 'a', 'b' };
			
			wr.write(data);
			
			wr.write("hello world");
			wr.write("""
					<h1>Lorem Ipsum</h1>
					""");

			wr.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("출력 완료");
	}
}

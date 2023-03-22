package ch18.lecture.p02outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class C06OutputStream {
	public static void main(String[] args) {
		try (OutputStream os = new FileOutputStream("output/output6.txt")) {
			// 한 바이트 쓰기
			os.write(298734);
			os.write(92873492);

			// 여러 바이트 쓰기
			byte[] data = { 3, 1, 0, 127, 64 };
			os.write(data);
			os.write(data);

			os.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

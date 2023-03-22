package ch18.lecture.p03inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C06InputStream {
	public static void main(String[] args) {

		String src = "output/image1.jpg";
		String des = "output/image_copy2.jpg";

		try (InputStream is = new FileInputStream(src);
				OutputStream os = new FileOutputStream(des)) {

			byte[] data = new byte[1024]; // 1kbyte

			while (true) {
				int len = is.read(data);
				if (len == -1) {
					break;
				}
				os.write(data, 0, len);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("복사완료");
	}
}

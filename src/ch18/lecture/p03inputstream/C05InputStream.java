package ch18.lecture.p03inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C05InputStream {
	public static void main(String[] args) {

		String src = "output/image1.jpg";
		String des = "output/image_copy.jpg";

		try (InputStream is = new FileInputStream(src);
				OutputStream os = new FileOutputStream(des)) {

			int data = 0;

			while ((data = is.read()) != -1) {
				os.write(data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("복사완료");
	}
}

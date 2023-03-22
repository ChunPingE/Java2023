package ch18.lecture.p02outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C02Close {
	public static void main(String[] args) {
		// finally블럭에서도 사용할 수 있게 try블럭 밖에서 선언
		OutputStream os = null;
		try {
			// 스트림 열고
			os = new FileOutputStream("output/output.txt");
			// 어떤 작업
			os.write(1);
			os.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 꼭해야함
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

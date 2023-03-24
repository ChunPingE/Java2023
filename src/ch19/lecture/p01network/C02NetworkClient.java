package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C02NetworkClient {
	public static void main(String[] args) {
		// ip주소
		String ip = "172.30.1.60";
		// port번호
		int port = 50500;

		try (Socket socket = new Socket(ip, port);
				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr)) {

			char[] buf = new char[1024];
			while (true) {
				int len = br.read(buf);
				if (len == -1) {
					break;
				}
				System.out.println(new String(buf, 0, len));
			}
			System.out.print("프로그램 종료");
			
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

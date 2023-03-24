package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C03NetworkServer {
	public static void main(String[] args) {
		// ip주소
		// port번호 필요

		int port = 50500;

		try (ServerSocket serverSocket = new ServerSocket(port)) {
			System.out.println("연결 기다리는 중....");
			try (Socket socket = serverSocket.accept();
					InputStream is = socket.getInputStream();
					InputStreamReader isr = new InputStreamReader(is);
					BufferedReader br = new BufferedReader(isr);) {

				char[] buf = new char[1024];
				while (true) {
					int len = br.read(buf);
					if (len == -1) {
						break;
					}
					System.out.print(new String(buf, 0, len));
				}
				System.out.println();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}

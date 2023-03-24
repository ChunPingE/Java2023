package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C05NetworkClient {
	public static void main(String[] args) {
		// ip주소
		String ip = "172.30.1.60";
		// port번호
		int port = 50500;

		try (Socket socket = new Socket(ip, port);
				OutputStream os = socket.getOutputStream();
				BufferedOutputStream bos = new BufferedOutputStream(os);
				PrintStream ps = new PrintStream(bos)) {

			try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
				while (true) {
					System.out.print("서버에게 보낼 데이터 작성> ");
					String str = br.readLine();
					if (str.toLowerCase().equals("q")) {
						break;
					}
					ps.print(str);
					ps.flush();
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램종료");
	}
}

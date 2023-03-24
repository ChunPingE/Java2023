package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C04NetworkClient {
	public static void main(String[] args) {
		// ip주소
		String ip = "172.30.1.60";
		// port번호
		int port = 50500;

		try (Socket socket = new Socket(ip, port);
				OutputStream os = socket.getOutputStream();
				BufferedOutputStream bos = new BufferedOutputStream(os);
				PrintStream ps = new PrintStream(bos)) {

			ps.println("Hello server, i am Client");
			
			ps.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램종료");
	}
}

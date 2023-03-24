package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C06Server {
	public static void main(String[] args) {
		int port = 50500;

		try (ServerSocket serverSocket = new ServerSocket(port);) {

			while (true) {
				System.out.println("연결 기다리는중...");
				Socket socket = serverSocket.accept();
				Thread t = new Thread(() -> {
					try (InputStream is = socket.getInputStream();
							BufferedInputStream bos = new BufferedInputStream(is);
							InputStreamReader isr = new InputStreamReader(bos);) {
						char[] data = new char[1024];
						System.out.println("입력 받는 중...");
						while (true) {
							int len = isr.read(data);
							if (len == -1) {
								break;
							}
							System.out.println(new String(data, 0, len));
						}
						//소켓 닫기
						socket.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				});
				t.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

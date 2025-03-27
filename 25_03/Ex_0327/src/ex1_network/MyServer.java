package ex1_network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {

	ServerSocket ss;

	public MyServer() {

		try {
			// 클라이언트가 접속할 때 필요한 통로 개념인 포트 번호를 지정
			ss = new ServerSocket(3000);
			System.out.println("서버 준비 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// 언제 접속할 지 모르는 클라이언트를 받기 위해
		// 무한 반복으로 접속자를 기다린다
		while (true) {
			// Socket : 접속자

			try {
				Socket s = ss.accept();

				// 접속자의 ip 주소를 가져옴
				String ip = s.getInetAddress().getHostAddress();
				
				System.out.println(ip + "님 다녀감");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

package ex2_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {

	ServerSocket ss;

	public MyServer() {
		try {
			ss = new ServerSocket(3001);
			System.out.println("서버 준비 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				Socket s = ss.accept();

				// 접속한 클라이언트는 접속과 동시에 정보를 보내므로
				// 클라이언트가 전송한 문자열을 받아야 한다.
				InputStreamReader isr = new InputStreamReader(s.getInputStream());
				BufferedReader reader = new BufferedReader(isr);
				
				//접속자(클라이언트)가 보낸 메시지
				String msg = reader.readLine();
				
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + ": " + msg);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} // while
	}
}

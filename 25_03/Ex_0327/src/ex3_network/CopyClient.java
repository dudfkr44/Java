package ex3_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CopyClient extends Thread {
	Socket s;
	BufferedReader in;
	PrintWriter out;
	ChatServer server;
	String ip;

	public CopyClient(Socket s, ChatServer cs) {

		this.s = s;
		this.server = cs;

		try {
			out = new PrintWriter(s.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			ip = s.getInetAddress().getHostAddress();
		} catch (Exception e) {
			// TODO: handle exception
		}

	} // 생성자

	@Override
	public void run() {

		while (true) {
			try {

				String msg = in.readLine();
				if (msg.equals("xx:~X")) {
					out.println("xx:~X");

					// 채팅을 종료할 클라이언트 정보를 서버로 보내서
					// list에서 제거
					server.removeClient(this);

					break;

				} // if
				

				server.SendMassage(ip + " : " + msg);

			} catch (Exception e) {
				// TODO: handle exception
			} // try-catch
		} // while

	} // run
}

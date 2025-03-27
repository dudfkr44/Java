package ex3_network;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer extends Thread {

	ServerSocket ss;

	// 접속한 클라이언트들을 저장해둘 리스트
	List<CopyClient> list;

	public ChatServer() {

		try {

			list = new ArrayList<CopyClient>();

			ss = new ServerSocket(3002);
			System.out.println("서버 준비 완료");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	// 종료를 원하는 클라이언트를 list에서 삭제
	public void removeClient(CopyClient cc) {
		list.remove(cc);
		SendMassage("*** " + cc.ip + "님 퇴장 ***");

	} // removeClient

	// 접속 중인 모든 사용자에게 메시지를 전달하는 메서드
	public void SendMassage(String msg) {

		try {

			for (CopyClient cc : list) {
				// 리스트에 담긴 모든 접속자들에게 메시지를 전달
				cc.out.println(msg);
			}

		} catch (Exception e) {
			// TODO: handle exception
		} // try-catch

	} // SendMassage

	@Override
	public void run() {

		while (true) {

			try {

				Socket s = ss.accept();
				String ip = s.getInetAddress().getHostAddress();
				System.out.println(ip + "님 접속!");

				// 새로 접속한 클라이언트를 list에 저장
				CopyClient cc = new CopyClient(s, this);
				list.add(cc);
				cc.start();

			} catch (Exception e) {
			}

		} // while

	} // run
}

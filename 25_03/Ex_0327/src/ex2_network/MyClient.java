package ex2_network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String msg = sc.nextLine();

		Socket s = null;
		PrintWriter out = null;

		try {

			// 서버 ip와 포트를 통해 클라이언트가 서버로 접속을 시도
			s = new Socket("192.168.10.52", 3001);

			// 서버로 문장을 전달하기 위한 스트림
			out = new PrintWriter(s.getOutputStream());

			// 서버로 문자열 전달
			out.write(msg);

			out.flush();

		} catch (Exception e) {

		} finally {
			try {
				out.close();
				s.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		sc.close();

	} // main
}

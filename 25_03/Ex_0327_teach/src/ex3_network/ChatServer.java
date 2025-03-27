package ex3_network;

import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer extends Thread{

	ServerSocket ss;
	
	public ChatServer() {
		
		try {
			
			ss = new ServerSocket(3002);
			System.out.println("서버시작!");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	@Override
	public void run() {
		
		while(true) {
			
			try {
				
				Socket s = ss.accept();
				String ip = s.getInetAddress().getHostAddress();
				System.out.println( ip + "님 접속!" );
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}//while
		
	}
	
}





















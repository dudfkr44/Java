package ex1_network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread{

	ServerSocket ss;
	
	public MyServer() {
		
		try {
			//클라이언트가 접속할 때 필요한 통로개념인 포트번호를 지정
			ss = new ServerSocket( 3000 );
			System.out.println("서버준비 완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void run() {
		
		//언제 접속할지 모르는 클라인트를 받아야하기 때문에
		//무한반복을 하면서 접속자를 기다린다
		while(true){
			
			try {
				//Socket : 접속자
				Socket s = ss.accept();
				
				//접속자의 ip주소를 가져와보자
				String ip = s.getInetAddress().getHostAddress();
				
				System.out.println(ip + "님 다녀감");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//while
		
	}
	
}









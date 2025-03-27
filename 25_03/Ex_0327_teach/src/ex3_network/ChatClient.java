package ex3_network;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient extends Thread{
	
	TextArea area;
	TextField input;
	Frame frame;
	Button send_btn;
	
	//서버접속을 위한 객체
	Socket s;
	BufferedReader in;
	PrintWriter out;
	Thread t;
	
	public ChatClient() {
		
		//화면구현
		frame = new Frame();
		frame.setLayout(null);
		frame.setBounds(400, 100, 400, 500);
		
		//채팅결과를 보는 화면
		area = new TextArea();
		area.setBounds(30, 50, 340, 380);
		area.setEditable(false);
		
		//채팅작성을 위한 객체
		input = new TextField();
		input.setBounds(30, 450, 260, 25);
		
		send_btn = new Button("send");
		send_btn.setBounds(295, 449, 75, 25);
		
		//전송버튼에 이벤트 감지자 등록
		send_btn.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//서버로 메시지를 전달
				sendData();
			}
		} );
		
		frame.add(area);
		frame.add(input);
		frame.add(send_btn);
		
		frame.addWindowListener( new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				//종료하기 전 서버접속 해제
				//스레드 소멸을 위해 다른 사용자들에게 종료메시지를 보낸다
				out.println("xx:~X");
				
			};
		} );
		
		connected();//서버접속
		
		//서버로부터 전달되는 메시지를 감지하여 받아줄 스레드
		t = new Thread( this );
		t.start();
		
		frame.setVisible(true);
		
	}//생성자
	
	//서버접속
	private void connected() {
		try {
			
			s = new Socket("192.168.10.12", 3002);
			in = new BufferedReader( new InputStreamReader( s.getInputStream() ) );
			out = new PrintWriter( s.getOutputStream(), true );
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//서버로 메시지를 전달하기 위한 메서드
	private void sendData() {
		String msg = input.getText().trim();
		
		//한글자라도 입력이 됐을때만 서버로 보내기
		if( msg.length() > 0 ) {
			out.println( msg );
		}
		
		input.setText("");
		
	}//sendData()
	
	@Override
	public void run() {
		
		while(true) {
			//전달되는 메시지를 기다렸다가 
			//새로운 메시지가 도착하면 화면에 출력
			try {
				
				String msg = in.readLine();
				
				if( msg.equals("xx:~X") ) {
					break;
				}
				
				if( msg != null ) {
					area.append( msg + "\n" );
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}//while
		
		//열려있는 스트림 종료
		try {
			out.close();
			in.close();
			s.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//프로그램 종료
				
	}//run()
	
}






package ex3_network;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient extends Thread {

	// UI를 위한 객체
	TextArea area;
	TextField input;
	Frame frame;
	Button send_btn;

	// 서버 접속을 위한 객체
	Socket s;
	BufferedReader in;
	PrintWriter out;
	Thread t;

	public ChatClient() {
		// 화면 구현
		frame = new Frame();
		frame.setLayout(null);
		frame.setBounds(400, 100, 400, 500);

		// 채팅 결과를 출력하는 화면
		area = new TextArea();
		area.setBounds(30, 50, 340, 380);
		area.setEditable(false);

		// 채팅 작성을 위한 객체
		input = new TextField();
		input.setBounds(30, 445, 260, 25);
		send_btn = new Button("send");
		send_btn.setBounds(294, 443, 75, 25);

		send_btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 서버로 메시지를 전달
				SendData(); // SendData 클래스의 기능을 호출
			}
		});

		input.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) { // 엔터 키 감지
					SendData(); // SendData 클래스의 기능을 호출
				}
			}
		});

		frame.add(area);
		frame.add(input);
		frame.add(send_btn);

		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {

				// 종료하기 전 서버 접속 해제
				// 스레드 소멸을 위해 다른 사용자들에게 종료 메시지를 보냄
				out.println("xx:~X");
				frame.dispose();
			}
		});

		connected(); // 서버 접속

		// 서버로부터 전달되는 메시지를 감지하여 받아줄 스레드
		t = new Thread(this);
		t.start();

		frame.setVisible(true);
	} // 생성자

	// 서버 접속
	private void connected() {
		try {
			s = new Socket("192.168.10.12", 3002);
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out = new PrintWriter(s.getOutputStream(), true);

		} catch (Exception e) {
			// TODO: handle exception
		}
	} // connected

	// 서버로 메시지를 전달하기 위한 메서드
	private void SendData() {
		String msg = input.getText().trim();
		// 한 글자라도 입력이 되었을 때만 서버로 보내기
		if (msg.length() > 0) {
			out.println(msg);
		}

		input.setText("");
	}

	@Override
	public void run() {

		while (true) {
			// 전달되는 메시지를 기다렸다가
			// 새로운 메시지가 도착하면 화면에 출력
			try {
				String msg = in.readLine();

				if (msg.equals("xx:~X")) {
					break;
				}

				if (msg != null) {
					area.append(msg + "\n");
				}

			} catch (Exception e) {
				// TODO: handle exception
			}
		} // while

		// 열려 있는 스트림 종료
		try {
			out.close();
			in.close();
			s.close();

			System.exit(0);// 열려 있는 프레임도 종료
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 프로그램 종료

	} // run()

}

package ex5_layout;

import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FrameTest {
	public static void main(String[] args) {

		Frame frame = new Frame();
		frame.setBounds(500, 200, 250, 400);
		frame.setLayout(null);
		frame.setBackground(Color.GRAY);

		Font font = new Font("", Font.PLAIN, 18);

		// 프레임의 최상단에 위치할 TextField, Button 객체 생성
		// TextField - 키보드에서 한줄짜리 값을 입력받는 객체
		TextField tf = new TextField();
		tf.setFont(font);
		tf.setBounds(10, 35, 180, 25);

		Button btn = new Button("입력");
		btn.setFont(font);
		btn.setEnabled(false);
		btn.setBounds(197, 35, 40, 25);

		// 프레임 중앙에 배치될 TextArea(문자열이 표시될 공간)
		// TextArea(추가할 텍스트, 세로 길이, 가로 길이, 스크롤 바 스타일)
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setFont(font);
		ta.setBounds(10, 70, 228, 250);
		ta.setEditable(false);// 직접 값 입력 방지

		// 동작 감지자 생성
		ActionListener actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!tf.getText().isEmpty()) {
					ta.append(tf.getText() + "\n");
					tf.setText("");
					tf.requestFocus();
				}
			}
		};

		// 버튼 클릭 시 동작
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// append(기존값을 유지하며 새로운 값을 추가하는 메서드)
				ta.append(tf.getText() + "\n"); // TextArea에 추가
				// setText(기존값을 지우고 새로운 값을 대체하는 메서드)
				tf.setText(""); // TextField의 값 초기화
				tf.requestFocus(); // TextField로 커서를 이동
			}
		});

		// Button과 TextField에 동작 감지자 연결
		btn.addActionListener(actionListener);

		// tf에서 엔터 값을 감지해 btn와 동일한 기능 수행
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {
					ta.append(tf.getText() + "\n");
					tf.setText("");
					tf.requestFocus();
				}
			}

		});

		// TextField(tf) 입력 감지자 (텍스트 입력 시 입력 버튼 활성화)
		tf.addTextListener(new TextListener() {
			@Override
			public void textValueChanged(TextEvent e) {
				if (tf.getText().equals("")) {
					btn.setEnabled(false);
				} else {
					btn.setEnabled(true);
				}
			}
		});

		// 프레임 하단에 배치될 버튼들
		Button btnSave = new Button("저장");
		Button btnClose = new Button("닫기");
		btnSave.setBounds(15, 340, 100, 40);
		btnClose.setBounds(135, 340, 100, 40);

		btnClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}

		});

		btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// ta의 값을 message 변수에 저장
				String message = ta.getText();

				// 파일 생성을 위한 객체 선언
				FileWriter fw = null;
				BufferedWriter bw = null;

				try {
					FileDialog fd = new FileDialog(frame, "파일로 저장", FileDialog.SAVE);
					fd.setVisible(true);

					String path = fd.getDirectory() + fd.getFile();
					System.out.println(path + " 경로에 저장");

					// ta에 내용이 있다면 저장

					if (!message.equals("")) {

						fw = new FileWriter(path);
						bw = new BufferedWriter(fw);

						bw.write(message);
						bw.flush();

					} else {
						JOptionPane.showMessageDialog(frame, "저장할 내용이 없습니다.");
						// message 변수에 아무런 문자열이 없다면 위 내용 출력
					}

				} catch (Exception e2) {
					// TODO: handle exception
				} finally {
					try {
						bw.close();
						fw.close();
					} catch (IOException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
				}
			}

		});

		// 컴포넌트 추가
		frame.add(tf);
		frame.add(btn);
		frame.add(ta);
		frame.add(btnSave);
		frame.add(btnClose);

		// 프레임 닫기 이벤트
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

// 프레임 표시
		frame.setVisible(true);
		tf.requestFocus(); // 초기 포커스 설정
	}
}
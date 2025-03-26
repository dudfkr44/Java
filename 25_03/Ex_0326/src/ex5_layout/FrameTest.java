package ex5_layout;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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

		// 동작 감지자 생성
		ActionListener actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = tf.getText().trim();
				if (!input.isEmpty()) {
					ta.append(input + "\n");
					tf.setText("");
					tf.requestFocus();
				}
			}
		};

		// Button과 TextField에 동작 감지자 연결
		btn.addActionListener(actionListener);
		tf.addActionListener(actionListener); // Enter 키 입력 시 실행

		// TextField 텍스트 변경 감지자
		tf.addTextListener(new TextListener() {
			@Override
			public void textValueChanged(TextEvent e) {
				btn.setEnabled(tf.getText().trim().length() > 0);
			}
		});

		// 컴포넌트 추가
		frame.add(tf);
		frame.add(btn);
		frame.add(ta);

		// 버튼 클릭 시 동작
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = tf.getText().trim();
				if (!input.isEmpty()) {
					ta.append(input + "\n"); // TextArea에 추가
					tf.setText(""); // TextField 초기화
					tf.requestFocus(); // TextField에 커서 재설정
				}
			}
		});

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
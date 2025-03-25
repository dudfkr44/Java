package ex5_button;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonText4 {

	public static void main(String[] args) {

		Frame f1 = new Frame();
		f1.setBounds(400, 200, 500, 300);

		// Font.PLAIN : 글자의 기본 글꼴
		// Font.BOLD : 글자의 굵은 글꼴
		// Font.ITALIC : 글자의 기울임 글꼴
		Font font = new Font("폰트", Font.BOLD, 30);

		Label l1 = new Label("나는 메인", Label.CENTER);
		l1.setBounds(100, 50, 300, 200);
		l1.setFont(font);

		f1.add(l1);

		f1.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				new ButtonSubPopup();
			}
		});

		f1.setResizable(false); // 창 크기 조절 불가
		f1.setVisible(true);

	} // main

}

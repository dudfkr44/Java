package ex5_button;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest3 {
	static int count = 0;

	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(300, 100, 500, 300);

		f.setLayout(null); // 자동 배치 비활성

		// 텍스트 출력을 위한 클래스
		Label text = new Label("0", Label.CENTER);
		text.setBounds(200, 50, 100, 50);
		text.setBackground(Color.GREEN);

		// 버튼 클릭 이벤트 감지자
		ActionListener act = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				switch (e.getActionCommand()) {
				case "Up":
					count++;
					break;

				case "Down":
					count--;
					break;

				case "Reset":
					count = 0;
					break;
				}// switch
				text.setText("" + count);
			}
		};

		Button btnUp = new Button("Up");
		btnUp.setBounds(100, 150, 300, 30);
		btnUp.addActionListener(act);

		Button btnDown = new Button("Down");
		btnDown.setBounds(100, 200, 300, 30);
		btnDown.addActionListener(act);

		Button btnReset = new Button("Reset");
		btnReset.setBounds(100, 250, 300, 30);
		btnReset.addActionListener(act);

		f.add(text);
		f.add(btnUp);
		f.add(btnDown);
		f.add(btnReset);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);

	} // main
}

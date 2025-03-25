package ex5_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest2 {
	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(500, 300, 450, 300);

		f.setLayout(null);

		Button btn1 = new Button("btn1");
		btn1.setBounds(80, 80, 100, 50);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("안녕하세요");

			}
		});

		Button btn2 = new Button("btn2");
		btn2.setBounds(250, 80, 100, 50);
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("반갑습니다");

			}
		});

		// 버튼3, 버튼4의 이벤트 감지를 위한 인터페이스
		ActionListener act = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// System.out.println(e.getActionCommand());

				switch (e.getActionCommand()) {

				case "btn3":
					System.out.println("고맙습니다");
					break;

				case "btn4":
					Frame f2 = new Frame();
					f2.setBounds(600, 400, 225, 150);
					f2.setVisible(true);

					f2.addWindowListener(new WindowAdapter() {
						@Override
						public void windowClosing(WindowEvent e) {
							//f2만 개별적으로 종료 - dispose();
							f2.dispose();
						}
					});

					break;
				}

			}
		};

		Button btn3 = new Button("btn3");
		btn3.setBounds(80, 150, 100, 50);
		btn3.addActionListener(act);

		Button btn4 = new Button("btn4");
		btn4.setBounds(250, 150, 100, 50);
		btn4.addActionListener(act);

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true);

	} // main
}

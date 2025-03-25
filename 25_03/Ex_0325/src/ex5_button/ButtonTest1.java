package ex5_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest1 {
	public static void main(String[] args) {

		Frame f = new Frame("버튼 테스트");
		// f.setSize(400, 400);
		// f.setLocation(300, 200);
		f.setBounds(400, 400, 400, 200); // 창의 크기 Size와 Location의 설정을 한 번에 지정(x, y, 높이, 너비)
		
		//프레임의 자동배치를 비홣성
		f.setLayout(null);

		// 버튼 생성
		Button btnok = new Button("확인");
		btnok.setBounds(70, 90, 100, 50);
		Button btnClose = new Button("취소");
		btnClose.setBounds(230, 90, 100, 50);

		// f에 버튼 객체를 추가
		f.add(btnok);
		f.add(btnClose);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true);

	} // main
}

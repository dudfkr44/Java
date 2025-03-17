package ex10_event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventMain {
	public static void main(String[] args) {

		Frame f = new Frame();
		Button btn = new Button("버튼");
		f.setSize(500, 500);
		f.add(btn);
		f.setVisible(true);

//		파라미터 자리에 이름이 없는 클래스가 생성되는 것을 "익명 내부 클래스"
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		}); // 메서드의 파라미터로 생성되는 메서드

	} // main
}

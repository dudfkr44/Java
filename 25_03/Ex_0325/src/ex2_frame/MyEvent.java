package ex2_frame;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyEvent implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// x 버튼 클릭을 감지하는 메서드
		System.out.println("x버튼 클릭");
		System.exit(0); // 열려 있는 모든 프레임을 종료

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// 창이 최소화 됐음을 감지하는 메서드
		System.out.println("창이 최소화 되었음");

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// 최소화 상태의 창이 원래 크기로 돌아왔을 때를 감지하는 메서드
		System.out.println("원래 크기로 돌아옴");

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}

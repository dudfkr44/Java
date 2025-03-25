package ex1_frame;

import java.awt.Color;
import java.awt.Frame;

public class Ex1_Frame {
	public static void main(String[] args) {

//		UI(유저 인터페이스)를 만드는 대표적인 클래스 Frame
		Frame frame = new Frame("나의 첫 프레임");
		frame.setLocation(500, 200); // 창의 위치 (x, y 좌표)
		frame.setSize(400, 300); // 창의 너비, 높이

		frame.setBackground(Color.BLUE); // 창의 배경색을 파랑색으로 지정

		frame.setVisible(true); // 프레임 보이기 설정

	} // main
}

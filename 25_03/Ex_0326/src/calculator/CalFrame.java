package calculator;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CalFrame {
	public static void main(String[] args) {
		Frame calFrame = new Frame("계산기"); // 계산기 창의 프레임과 제목 "계산기" 선언
		calFrame.setBounds(400, 200, 260, 300); // 계산기 창이 생성될 위치(x, y)와 크기(너비, 높이) 설정
		calFrame.setLayout(null); // 버튼 자동 배치 해제
		Font font = new Font("", Font.BOLD, 20); // 글꼴 크기와 형태 변경(굵은 글꼴, 크기 20)

		Label display = new Label("0"); // 값을 표시할 공간(레이블)을 설정하고 초기값은 "0"으로 설정
		display.setBounds(10, 180, 180, 100); // 값을 표시할 공간이 생성될 위치(x, y)와 크기(너비, 높이) 설정
		display.setFont(font); // 표시될 글꼴에 설정된 글꼴 모양 적용

		calFrame.add(display); // 계산기 창에 표시할 창 공간 추가

		// 모든 버튼의 이벤트를 감지할 이벤트 감지자 클래스 생성
		MyListener ml = new MyListener();
		ml.setLb(display);

		// 숫자 버튼들 생성
		Button[] nums = new Button[10];
		for (int i = 0; i < nums.length; i++) {

			nums[i] = new Button("" + i); // i의 번호값을 문자열 형태로 출력

			// 버튼의 위치, 크기 지정
			if (i >= 0 && i <= 4) {
				nums[i].setBounds(i * 50 + 10, 40, 40, 40);
			} else {
				nums[i].setBounds((i - 5) * 50 + 10, 90, 40, 40);
			}

			nums[i].addActionListener(ml); // 숫자 버튼에 감지자 기능 추가
			nums[i].setFont(font);
			calFrame.add(nums[i]);

		} // for

		// 연산자 버튼들 생성
		Button[] opers = new Button[5];
		String[] opStr = { "+", "-", "×", "÷", "=" };
		for (int i = 0; i < opers.length; i++) {
			opers[i] = new Button(opStr[i]);
			opers[i].setBounds(i * 50 + 10, 140, 40, 40);
			opers[i].setFont(font);

			opers[i].addActionListener(ml); // 연산자 버튼에 감지자 기능 추가
			calFrame.add(opers[i]);
		} // for

		// C버튼(초기화) 생성
		Button btnC = new Button("C");
		btnC.setBounds(200, 200, 50, 50);
		btnC.setFont(font);

		btnC.addActionListener(ml);
		calFrame.add(btnC); // C 버튼에 감지자 기능 추가

		// 종료 기능을 구현할 추상 메서드 호출
		calFrame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 콘솔 종료 시키는 메서드 선언
			}
		});
		calFrame.setVisible(true); // 계산기 창 보이게 활성화

	} // main
}

package ex6_homework;

import java.awt.*;
import java.awt.event.*;

public class Ex_MainFrame {
    private static Calculator calculator = new Calculator(); // Calculator 클래스 인스턴스화 및 메모리 선언
    private static Label display; // 계산 결과 표시 라벨

    public static void main(String[] args) {
        Frame frameMain = new Frame("계산기");
        frameMain.setBounds(500, 200, 500, 300);
        frameMain.setLayout(null);

        // 디스플레이 라벨 설정
        Font disFont = new Font("폰트", Font.BOLD, 30);
        display = new Label(calculator.getDisplayText());
        display.setBounds(50, 230, 300, 50);
        display.setFont(disFont);
        frameMain.add(display);

		Font btnFont = new Font("폰트", Font.BOLD, 25);
		// 숫자 버튼 생성 (0 ~ 9)
		Button btn0 = new Button("0");
		btn0.setFont(btnFont);
		Button btn1 = new Button("1");
		btn1.setFont(btnFont);
		Button btn2 = new Button("2");
		btn2.setFont(btnFont);
		Button btn3 = new Button("3");
		btn3.setFont(btnFont);
		Button btn4 = new Button("4");
		btn4.setFont(btnFont);
		Button btn5 = new Button("5");
		btn5.setFont(btnFont);
		Button btn6 = new Button("6");
		btn6.setFont(btnFont);
		Button btn7 = new Button("7");
		btn7.setFont(btnFont);
		Button btn8 = new Button("8");
		btn8.setFont(btnFont);
		Button btn9 = new Button("9");
		btn9.setFont(btnFont);

		// 연산자 버튼 생성
		Button btnPlus = new Button("+");
		btnPlus.setFont(btnFont);
		Button btnMinus = new Button("-");
		btnMinus.setFont(btnFont);
		Button btnMultiply = new Button("×");
		btnMultiply.setFont(btnFont);
		Button btnDivide = new Button("÷");
		btnDivide.setFont(btnFont);
		Button btnEqual = new Button("=");
		btnEqual.setFont(btnFont);
		Button btnC = new Button("C");
		btnC.setFont(btnFont);

		// 모든 버튼의 위치 설정
		// 숫자 버튼 위치
		btn0.setBounds(49, 50, 70, 50);
		btn1.setBounds(132, 50, 70, 50);
		btn2.setBounds(215, 50, 70, 50);
		btn3.setBounds(298, 50, 70, 50);
		btn4.setBounds(381, 50, 70, 50);
		btn5.setBounds(49, 110, 70, 50);
		btn6.setBounds(132, 110, 70, 50);
		btn7.setBounds(215, 110, 70, 50);
		btn8.setBounds(298, 110, 70, 50);
		btn9.setBounds(381, 110, 70, 50);

		// 연산자 버튼 위치
		btnPlus.setBounds(49, 170, 70, 50);
		btnMinus.setBounds(132, 170, 70, 50);
		btnMultiply.setBounds(215, 170, 70, 50);
		btnDivide.setBounds(298, 170, 70, 50);
		btnEqual.setBounds(381, 170, 70, 50);
		btnC.setBounds(381, 230, 70, 50);

        // ActionListener 재구성 (Calculator 메서드 호출)
        ActionListener act = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cmd = e.getActionCommand();

                if (cmd.matches("[0-9]")) { // 숫자 버튼
                    calculator.appendDigit(cmd);
                } else if (cmd.equals("C")) { // 초기화
                    calculator.clear();
                } else if (cmd.equals("=")) { // 계산 실행
                    calculator.calculate();
                } else { // 연산자 (+, -, ×, ÷)
                    calculator.setOperator(cmd);
                }

                // 모든 경우에 디스플레이 업데이트
                display.setText(calculator.getDisplayText());
            }
        };

		// 모든 숫자 버튼에 ActionListener 등록
		Button[] numberBtns = { btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9 };
		for (Button btn : numberBtns)
			btn.addActionListener(act);

		// 연산자 버튼에 ActionListener 등록
		Button[] operatorBtns = { btnPlus, btnMinus, btnMultiply, btnDivide, btnEqual, btnC };
		for (Button btn : operatorBtns)
			btn.addActionListener(act);

		// 모든 버튼 기능을 메인 프레임에 추가
		frameMain.add(btn0);
		frameMain.add(btn1);
		frameMain.add(btn2);
		frameMain.add(btn3);
		frameMain.add(btn4);
		frameMain.add(btn5);
		frameMain.add(btn6);
		frameMain.add(btn7);
		frameMain.add(btn8);
		frameMain.add(btn9);
		frameMain.add(btnPlus);
		frameMain.add(btnMinus);
		frameMain.add(btnMultiply);
		frameMain.add(btnDivide);
		frameMain.add(btnEqual);
		frameMain.add(btnC);

		frameMain.setVisible(true); // 창 표시

		// 창 닫기 이벤트 처리 (X 버튼 클릭 시 종료)
		frameMain.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				new ButtonExitPopUp();// 프로그램 종료
			}
		});
	}
}
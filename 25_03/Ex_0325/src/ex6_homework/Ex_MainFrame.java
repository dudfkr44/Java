package ex6_homework;

import java.awt.*;
import java.awt.event.*;

public class Ex_MainFrame {
	private static int n1 = 0; // 첫 번째 숫자 저장
	private static int n2 = 0; // 두 번째 숫자 저장
	private static String op = ""; // 연산자 저장 (예: "+", "÷")
	private static Label display; // 계산 결과 표시 라벨 (Label 사용)

	public static void main(String[] args) {
		// 메인 창 설정
		Frame frameMain = new Frame("계산기");
//		frame.setLocation(500, 200); // 창의 위치 (x, y 좌표)
//		frame.setSize(500, 300); // 창의 너비, 높이
		frameMain.setBounds(500, 200, 500, 300); // 창 위치와 크기 설정 (x, y, width, height)
		frameMain.setLayout(null); // 레이아웃 자동 정렬 해제

		// 디스플레이 라벨 설정 (Label 사용)
		Font font = new Font("폰트", Font.BOLD, 30);
		display = new Label("0"); // 초기 값은 "0"로 설정
		display.setBounds(50, 230, 300, 50); // 위치: x=50, y=230 / 크기: 400x30
		frameMain.add(display); // 창에 라벨 추가
		display.setFont(font);

		Font font2 = new Font("폰트", Font.BOLD, 25);
		// 숫자 버튼 생성 (0 ~ 9)
		Button btn0 = new Button("0");
		btn0.setFont(font2);
		Button btn1 = new Button("1");
		btn1.setFont(font2);
		Button btn2 = new Button("2");
		btn2.setFont(font2);
		Button btn3 = new Button("3");
		btn3.setFont(font2);
		Button btn4 = new Button("4");
		btn4.setFont(font2);
		Button btn5 = new Button("5");
		btn5.setFont(font2);
		Button btn6 = new Button("6");
		btn6.setFont(font2);
		Button btn7 = new Button("7");
		btn7.setFont(font2);
		Button btn8 = new Button("8");
		btn8.setFont(font2);
		Button btn9 = new Button("9");
		btn9.setFont(font2);

		// 연산자 버튼 생성
		Button btnPlus = new Button("+");
		btnPlus.setFont(font2);
		Button btnMinus = new Button("-");
		btnMinus.setFont(font2);
		Button btnMultiply = new Button("×");
		btnMultiply.setFont(font2);
		Button btnDivide = new Button("÷");
		btnDivide.setFont(font2);
		Button btnEqual = new Button("=");
		btnEqual.setFont(font2);
		Button btnC = new Button("C");
		btnC.setFont(font2);

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

		// 버튼 클릭 이벤트 처리기 (ActionListener)
		ActionListener act = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand(); // 클릭한 버튼의 텍스트

				// 숫자 버튼 클릭 처리
				if (cmd.matches("[0-9]")) {
					String current = display.getText(); // 현재 디스플레이 텍스트

					// "=" 결과 이후 새로운 입력 시 초기화
					if (current.contains("=")) {
						display.setText(cmd); // "7+3=10" 이후 "5" 입력 → "5"
					} else {
						// 초기 "0" 상태에서 숫자 입력 시 "0" 대체
						if (current.equals("0")) {
							display.setText(cmd);
						} else {
							display.setText(current + cmd); // 현재 텍스트에 숫자 추가 (예: "4" → "45")
						}
					}
				}

				// 연산자 버튼 클릭 처리
				else if (cmd.equals("+") || cmd.equals("-") || cmd.equals("×") || cmd.equals("÷")) {
					String current = display.getText();

					// "=" 결과가 있을 경우 (예: "4+3=7" → "7+")
					if (current.contains("=")) {
						n1 = Integer.parseInt(current.split("=")[1]); // "=" 뒤 결과값 추출 (7)
					} else {
						n1 = Integer.parseInt(current); // 현재 숫자를 첫 번째 숫자로 설정
					}

					op = cmd; // 선택한 연산자 저장
					display.setText(current + cmd); // 연산자 추가 (예: "4+3" → "4+3+")
				}

				// 결과 버튼 (=) 클릭 처리
				else if (cmd.equals("=")) {
					String exp = display.getText(); // 전체 표현식 (예: "4+3×2")
					int opIndex = exp.lastIndexOf(op); // 마지막 연산자 위치 찾기

					if (opIndex == -1 || op.isEmpty()) { // 연산자가 없는 경우
						display.setText("Error");
						return;
					}

					// 숫자 추출 (예: "4+3" → n1=4, n2=3)
					String strN1 = exp.substring(0, opIndex);
					String strN2 = exp.substring(opIndex + 1);
					n1 = Integer.parseInt(strN1);
					n2 = Integer.parseInt(strN2);

					int result = 0; // 결과 저장 변수
					switch (op) { // 연산자에 따라 계산
					case "+":
						result = n1 + n2;
						break;
					case "-":
						result = n1 - n2;
						break;
					case "×":
						result = n1 * n2;
						break;
					case "÷":
						if (n2 != 0) {
							result = n1 / n2;
						} else { // 0으로 나누기 오류
							display.setText("Error");
							return;
						}
						break;
					}

					// 결과 표시 (예: "4+3=7")
					display.setText(exp + "=" + result);

					// 초기화 (다음 계산을 위해 변수 리셋)
					op = "";
					n1 = 0;
					n2 = 0;
				}
				// C 버튼: 모든 초기화
				else if (cmd.equals("C")) {
					display.setText("0");
					n1 = 0;
					n2 = 0;
					op = "";
				}
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
				System.exit(0); // 프로그램 종료
			}
		});
	}
}
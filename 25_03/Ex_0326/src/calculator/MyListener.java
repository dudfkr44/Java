package calculator;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {

	private String num1 = "";
	private String num2 = "";
	private String op = "";
	private int res1 = 0; // +, -, ×의 연산 결과값을 출력
	private float res2 = 0; // ÷의 연산 결과값을 출력
	private int phase = 0; // num1, num2의 값을 나눠담기 위한 구분 변수

	// 결과를 보여줄 레이블
	private Label display;

	public void setLb(Label display) {
		this.display = display; // 표시될 값을 Calculator 클래스에 넘겨주기 위한 선언
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "+":
		case "-":
		case "×":
		case "÷":
			// 클릭된 연산자를 기억
			op = e.getActionCommand();
			phase = 1; // 연산자 입력 후에 num2의 값을 넣기 위해 phase를 1로 변경
			display.setText(num1 + " " + op + " "); // 표시 변수에 표시하기 위한 문자 배열 선언
			break;

		default:
			// 숫자 버튼을 입력했을 때를 판단
			if (phase == 0) {// num1에 값을 넣을 때는 phase는 0이어야 함
				num1 += e.getActionCommand(); // 문자 형태의 숫자를 이어 붙임
				display.setText(num1); // display에 입력된 num1의 값을 표시
			} else {
				num2 += e.getActionCommand(); // 문자 형태의 숫자를 이어 붙임
				display.setText(num1 + " " + op + " " + num2); // display에 입력된 num2의 값을 num1과 연산자 이후에 표시
			}
			break;

		case "=":
			phase = 0;
			if (op.equals("+")) {
				// 문자열 형태의 num1과 num2를 정수 형태로 변환 후 res1에 저장
				res1 = Integer.parseInt(num1) + Integer.parseInt(num2);
			} else if (op.equals("-")) {
				// 문자열 형태의 num1과 num2를 정수 형태로 변환 후 res1에 저장
				res1 = Integer.parseInt(num1) - Integer.parseInt(num2);
			} else if (op.equals("×")) {
				// 문자열 형태의 num1과 num2를 정수 형태로 변환 후 res1에 저장
				res1 = Integer.parseInt(num1) * Integer.parseInt(num2);
			} else if (op.equals("÷")) {
				// 문자열 형태의 num1과 num2를 실수 형태로 변환 후 res2에 저장
				res2 = Float.parseFloat(num1) / Float.parseFloat(num2);
			}

			// 결과 출력
			if (!op.equals("÷")) { // 연산자 변수(op)의 값이 ÷가 아닐 때 아래 형태로 출력
				display.setText(num1 + " " + op + " " + num2 + " = " + res1);
			} else {
				// 나누기 연산자 값을 출력할 때 일정한 형태의 문자열로 출력 (String.format 메서드)
				String formatStr = String.format("%s %s %s = %.1f", num1, op, num2, res2);
				display.setText(formatStr);
				break;

			}

		case "C":
			// 모든 항목 초기화
			num1 = "";
			num2 = "";
			op = "";
			res1 = 0;
			res2 = 0;
			phase = 0;
			display.setText("0");
			break;
		}

	}

}

package ex6_homework;

public class Calculator {
	private int n1 = 0; // 첫 번째 숫자
	private int n2 = 0; // 두 번째 숫자
	private String op = ""; // 연산자
	private String displayText = "0"; // 현재 디스플레이 텍스트

	// 숫자 버튼 입력 처리
	public void appendDigit(String digit) {
		if (displayText.equals("0")) {
			displayText = digit;
		} else {
			displayText += digit;
		}
	}

	// 연산자 버튼 입력 처리
	public void setOperator(String operator) {
		if (!op.isEmpty())
			return; // 연산자 중복 입력 방지
		n1 = Integer.parseInt(displayText);
		op = operator;
		displayText += " " + op + " ";
	}

	// 계산 실행 (= 버튼)
	public void calculate() {
		if (op.isEmpty())
			return; // 연산자 없을 시 무시
		String[] parts = displayText.split(" ");
		n2 = Integer.parseInt(parts[2]);
		int result = 0;

		switch (op) {
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
			if (n2 == 0) {
				displayText = "Error";
				return;
			}
			result = n1 / n2;
			break;
		}
		displayText = displayText + " = " + result;
		reset(); // 계산 후 초기화
	}

	// C 버튼: 초기화
	public void clear() {
		n1 = 0;
		n2 = 0;
		op = "";
		displayText = "0";
	}

	// 디스플레이 텍스트 가져오기
	public String getDisplayText() {
		return displayText;
	}

	// 계산 후 변수 초기화
	private void reset() {
		n1 = 0;
		n2 = 0;
		op = "";
	}
}
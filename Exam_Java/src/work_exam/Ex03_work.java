package work_exam;

import java.util.Scanner;

public class Ex03_work {
	public static void main(String[] args) {
		// 수1 : 11
		// 수2 : 50
		// 연산자 : +
		// 11 + 50 = 60
		// 계산기

		int n1 = readNumber("수1 : ");
		int n2 = readNumber("수2 : ");
		String op = readOperator();

		double result = 0;
		boolean isDivision = false;

		switch (op) {
		case "+":
			result = n1 + n2;
			break;
		case "-":
			result = n1 - n2;
			break;
		case "*":
			result = n1 * n2;
			break;
		case "/":
			isDivision = true;
			if (n2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}
			result = (double) n1 / n2;
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
			return;
		}

		printResult(n1, op, n2, result, isDivision);
	} // main

	private static int readNumber(String prompt) {
		Scanner sc = new Scanner(System.in);
		int number;
		while (true) {
			System.out.print(prompt);
			try {
				number = sc.nextInt();
				break;
			} catch (Exception e) {
				sc.nextLine(); // 입력 버퍼 비우기
				System.out.println("올바른 수를 입력하세요.");
			}
		}
		return number;
	} // readNumber

	private static String readOperator() {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자 : ");
		String op = sc.next();
		while (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) {
			System.out.println("올바른 연산자를 입력하세요 (+, -, *, /)");
			op = sc.next();
		}
		return op;
	} // readOperator

	private static void printResult(int n1, String op, int n2, double result, boolean isDivision) {
		if (isDivision) {
			System.out.printf("%d %s %d = %.1f%n", n1, op, n2, result);
		} else {
			System.out.printf("%d %s %d = %d%n", n1, op, n2, (int) result);
		}
	} // printResult
}

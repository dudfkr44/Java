package ex15_homework_practice;

import java.util.Random;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		int sub = 0;
		int mul = 0;
		int div = 0;
		int correctCount = 0;
		String input = "";
		int answer = 0;
		char[] op = {'+', '-', '*', '/'};

		TimeCount time = new TimeCount();
		time.setDaemon(true);
		time.start();

		while (true) {
			num1 = rnd.nextInt(100) + 1;
			num2 = rnd.nextInt(100) + 1;
			for (int i = 0; i < op.length; i++) {
				i
				
			}
			
			
			
			sum = num1 + num2;
			mul = num1 * num2;

			if (num1 < num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			sub = num1 - num2;
			div = num1 / num2;

			try {
				System.out.printf("%d + %d = ", num1, num2);
				input = sc.next();
				answer = Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println("정수를 입력하세요.");
				continue;
			}

			if (answer == sum) {
				System.out.println("정답!!");
				correctCount++;
				if (correctCount == 2) { // 정답 2개 달성 시
					time.setRunning(false); // 타임카운트 중지
					break; // 메인 루프 종료
				}
			} else {
				System.out.println("오답");
			}
		}

		System.out.printf("축하합니다. %d개의 모든 문제를 푸셨습니다.\n", correctCount);
		System.out.printf("결과 : %d초", time.getTime());
		sc.close();
	}
}
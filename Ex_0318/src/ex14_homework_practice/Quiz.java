package ex14_homework_practice;

import java.util.Random;
import java.util.Scanner;

public class Quiz {
//	1 ~ 100 사이의 난수 두 개를 더하는 문제를 출제
//	키보드에서 답을 입력받고, 다섯 문제가 정답 처리 되었을 때 프로그램을 종료
//	시작부터 종료 시까지 경과 시간을 출력
//	------------------------------------------------
//	23 + 48 = 71
//	정답!
//	68 + 52 = 1
//	오답
//	...
//	53 + 28 = 81
//	정답
//	결과 : 24초...
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int correctCount = 0;
		int sum = 0;
		TimeCount time = new TimeCount();
		time.start();

		while (correctCount < 5) {
			int num1 = rnd.nextInt(100) + 1;
			int num2 = rnd.nextInt(100) + 1;
			sum = num1 + num2;
			System.out.printf("%d + %d = ", num1, num2);

			String input = sc.next();

			try {
				int answer = Integer.parseInt(input);
				if (answer == sum) {
					correctCount++;
					System.out.println("정답!!");
					continue;
				} else {
					System.out.println("오답");
					continue;
				}
			} catch (NumberFormatException e) {
				System.out.println("정수를 입력하세요.");
				continue;
			}

		}
		time.TimeStop();

		System.out.println("5개의 정답을 모두 맞추셨습니다!");
		System.out.printf("결과 : %d초", time.getTime());

		sc.close();

	} // main

}

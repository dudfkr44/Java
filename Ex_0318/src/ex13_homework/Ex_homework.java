package ex13_homework;

import java.util.Random;
import java.util.Scanner;

public class Ex_homework {
	public static void main(String[] args) {

//		1 ~ 100 사이의 난수 두 개를 더하는 문제를 출제
//		키보드에서 답을 입력받고, 다섯 문제가 정답 처리 되었을 때 프로그램을 종료
//		시작부터 종료 시까지 경과 시간을 출력
//		------------------------------------------------
//		23 + 48 = 71
//		정답!
//		68 + 52 = 1
//		오답
//		...
//		53 + 28 = 81
//		정답
//		결과 : 24초...
		// 난수 생성기와 입력 스캐너 초기화
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		// 정답 카운터
		int correctCount = 0;

		// 시간 카운터 스레드 시작
		TimeCount time = new TimeCount();
		time.start(); // 스레드 실행 시작

		// 프로그램 시작 안내 메시지
		System.out.println("1부터 100 사이의 두 난수를 더하는 문제를 풀어보세요. 다섯 문제를 모두 맞추면 종료됩니다.");

		while (correctCount < 5) {
			// 1부터 100 사이의 두 난수 생성
			int num1 = random.nextInt(100) + 1;
			int num2 = random.nextInt(100) + 1;
			int correctAnswer = num1 + num2;

			// 문제 제시
			System.out.print(num1 + " + " + num2 + " = ");
			String input = scanner.nextLine();

			// 입력 값 처리
			try {
				int userAnswer = Integer.parseInt(input);
				if (userAnswer == correctAnswer) {
					System.out.println("정답!");
					correctCount++; // 정답 카운터 증가
				} else {
					System.out.println("오답");
				}
			} catch (NumberFormatException e) {
				System.out.println("유효한 정수를 입력해주세요.");
			}
		}

		// 퀴즈 종료 후 시간 카운터 스레드 중지
		time.stopCounting();

		// 결과 출력
		System.out.println("축하합니다! 다섯 문제를 모두 맞추셨습니다.");
		System.out.printf("결과: %d초%n", time.getTime());

		// 스캐너 닫기
		scanner.close();
	} // main
}
package homework;

import java.util.Scanner;

public class Ex1_homework {

	// 메인 메서드: 게임 실행
	public static void main(String[] args) {
		// 단어 배열 정의
		String[] words = { "apple", "banana", "cherry", "date" };
		HangMan hangman = new HangMan(words);
		Scanner scanner = new Scanner(System.in);
		
		int cnt = 0;
		// 게임 루프
		while (true) {
			cnt++;
			System.out.println("현재 상태: " + hangman.getCurrentState());
			System.out.println("추측한 문자: " + hangman.getGuessedLetters());
			System.out.print("문자를 추측하세요: ");

			String input = scanner.nextLine();

			// 입력 유효성 검사: 한 글자이고 문자인지 확인
			if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
				System.out.println("한 개의 문자만 입력하세요.");
				continue;
			}

			char letter = Character.toLowerCase(input.charAt(0)); // 소문자 변환
			hangman.guess(letter);
			
			// 승리 조건 확인
			if (hangman.isWordGuessed()) {
				System.out.printf("축하합니다! %d회만에 단어를 맞췄습니다: %s",cnt ,hangman.getCurrentState());
				break;
			}
		}

		scanner.close();
	}
}
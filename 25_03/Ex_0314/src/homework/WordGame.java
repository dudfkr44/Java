package homework;

import java.util.Scanner;

public class WordGame {
	public static void main(String[] args) { // A Class
//	문제 : PEALP (문자열을 무작위로 뽑은 후 문자열을 무작위로 나열해서 정답 맞추기 게임)
		Scanner sc = new Scanner(System.in);
		GameWork game = new GameWork(); // B Class에 들어간 게임 메서드 메모리 생성

		System.out.println("섞인 문자: " + game.getShuffledWord());// B Class 에서 섞인 문자열을 표시
		System.out.print("원본 단어 입력: ");

		// 게임 루프
		int cnt = 0;
		while (true) {
			cnt++;
			String guess = sc.nextLine();
			if (game.checkAnswer(guess)) {
				System.out.println(cnt + "회만에 정답! (" + game.getOriginalWord() + ")");
				break;
			} else {
				System.out.print("✖ 오답! 재입력: ");
			}
		}
		sc.close();
	}
}
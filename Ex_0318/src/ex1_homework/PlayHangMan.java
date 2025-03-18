package ex1_homework;

import java.util.Scanner;

public class PlayHangMan {

	Scanner sc;
	char[] star;
	int playCount;

	// 정답에 입력받은 단어가 포함되어 있는지 확인하는 변수 <- check
	boolean check;

	// 게임이 끝났는지 판단하는 변수 - isPlaying
	boolean isPlaying;
	String word;

// 생성자
	public PlayHangMan(String word) {
		this.word = word;
		star = new char[word.length()];
		sc = new Scanner(System.in);
	}

//정답 확인 변수
	public void play() {

		for (int i = 0; i < star.length; i++) {
			star[i] = '☆';
		} // for

		label: while (true) {
			playCount++;

			System.out.print("word : ");
			for (int i = 0; i < star.length; i++) {
				System.out.print(star[i]);
			} // for

			System.out.print(">> ");

			String in = sc.next();
			char c = in.charAt(0);

			// 한 글자의 영문 소문자를 입력했는지를 판단
			if (c < 'a' || c > 'z' || in.length() > 1) {
				System.out.println("한 글자의 영소문자만 입력하세요.");
				continue;
			}

			check = false;
			isPlaying = false;

			for (int i = 0; i < word.length(); i++) {

				if (star[i] == c) {
					System.out.println(c + "은(는) 이미 입력함.");
					continue label;
				} // for

				// 사용자의 입력값이 정답에 일치하는 값인지 확인
				if (c == word.charAt(i)) {
					star[i] = c;
					check = true;
				}

				// 게임을 지속할 것인지를 판단
				if (star[i] == '☆') {
					// 게임 중임을 판단
					isPlaying = true;
				}

			} // for

			// 문자가 포함되어 있는지 판단
			if (!check) { // check = false
				System.out.println(c + "이(가) 포함되지 않음.");
			}

			// 게임 종료 판단
			if (!isPlaying) { // isPlaying == false
				System.out.println("정답 : " + word);
				System.out.println(playCount + "회 만에 정답!");
				break;
			}

		} // while

		sc.close();
	}// play
}

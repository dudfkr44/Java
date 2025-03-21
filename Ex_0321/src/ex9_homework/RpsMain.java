package ex9_homework;

import java.util.Scanner;

public class RpsMain {
	public static void main(String[] args) {

//		id : abc
//		가입을 환영합니다.
//		0승 0무 0패
//		가위(s) || 바위(r) || 보(p) : r
//		당신이 이겼습니다.
//		1승 0무 0패
//		다시 ㄱㄱ?(y | n) : n
//		게임을 종료합니다.

//		id : abc
//		1승 0무 0패
//		가위(s) || 바위(r) || 보(p) : r
//		당신이 졌습니다.
//		1승 0무 1패
//		다시 ㄱㄱ?(y | n) : n
//		게임을 종료합니다.
		Scanner sc = null;

		try {
			sc = new Scanner(System.in);
			RpsWork game = null;
			int cnt = 0;

			while (true) { // 무한 루프로 ID 입력 창 계속 표시
				cnt++;
				System.out.print("id : ");
				String id = sc.nextLine().trim();
				if(cnt == 1) {
					System.out.printf("%s님! 가입을 환영합니다.\n", id);
				}

				if (game == null) {
					game = new RpsWork(); // 처음 실행 시 초기화
				}

				do {
					game.printStats();
					System.out.print("가위(s) || 바위(r) || 보(p) : ");
					String userChoice = sc.nextLine().trim().toLowerCase();

					if (!game.isValidChoice(userChoice)) {
						System.out.println("잘못된 입력입니다. 다시 입력하세요.");
						continue;
					}

					game.playRound(userChoice);

					System.out.print("다시 ㄱㄱ?(y | n) : ");
				} while (sc.nextLine().trim().equalsIgnoreCase("y"));

				// 게임 종료 시 ID 입력 창으로 돌아감
			}
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
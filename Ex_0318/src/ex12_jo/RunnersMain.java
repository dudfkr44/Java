package ex12_jo;

import java.util.Random;

public class RunnersMain {
	public static void main(String[] args) {
		Random rnd = new Random();

		int[] playerRandom = new int[4];
		String[] playerJump = new String[playerRandom.length];

		for (int i = 0; i < playerRandom.length; i++) {
			playerJump[i] = "";
		}

		boolean finish = false;
		int winPlayer = 0;

		while (true) {
			// 모든 플레이어의 이동 결정
			for (int i = 0; i < playerRandom.length; i++) {
				playerRandom[i] = rnd.nextInt(3);
			}

			// 이동 적용
			for (int i = 0; i < playerRandom.length; i++) {
				switch (playerRandom[i]) {
				case 0:
					playerJump[i] += ""; // 이동 없음
					break;
				case 1:
					playerJump[i] += " "; // 1칸 이동
					break;
				case 2:
					playerJump[i] += "  "; // 2칸 이동
					break;
				}
			}

			// 상태 출력
			for (int i = 0; i < playerJump.length; i++) {
				System.out.printf("%s %d옷%n", playerJump[i], (i + 1));
				if (playerJump[i].length() >= 50) {
					winPlayer = i + 1;
					finish = true;
				}
			}
			System.out.println("----------------------------------------------");

			// 승자 결정 및 종료
			if (finish) {
				System.out.println("winner " + winPlayer);
				break;
			}

			// 100ms 지연
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
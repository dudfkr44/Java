package ex9_homework_pra;

import java.util.Random;
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
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		RpsUser ru = new RpsUser();
		String id = "";
		int win = 0;
		int lose = 0;
		int draw = 0;

		System.out.print("id : ");
		id = sc.next();
		ru.setId(id);

		// 저장된 게임 불러오기
		ScoreLoader sl = new ScoreLoader();
		sl.loader(id);

		if (sl.getRu() != null) {
			ru = sl.getRu();
			win = ru.getWin();
			lose = ru.getLose();
			draw = ru.getDraw();
		}

		System.out.printf("%d승 %d패 %d무\n", win, lose, draw);

		while (true) {
			// 0 ~ 2 사이의 난수
			int r = rnd.nextInt(3);

			// 0:가위, 1:바위, 2:보
			System.out.print("가위(s) || 바위(r) || 보(p) : ");
			String u = sc.next();

			int usercnt = 0;

			if (u.equalsIgnoreCase("s")) {
				usercnt = 0;
			} else if (u.equalsIgnoreCase("r")) {
				usercnt = 1;
			} else if (u.equalsIgnoreCase("p")) {
				usercnt = 2;
			}

			// 경우의 수

//			유저 - 컴퓨터 = -2, 1 (유저가 이김)
			if (usercnt - r == -2 || usercnt - r == 1) {
				System.out.println("이겼습니다.");
				ru.setWin(++win);
			} else if (usercnt - r == 0) {
				System.out.println("비겼습니다.");
				ru.setDraw(++draw);
			} else {
				System.out.println("졌습니다.");
				ru.setLose(++lose);
			}

			System.out.printf("%d승 %d패 %d무\n", win, lose, draw);
			System.out.print("다시 ㄱㄱ?(y | n) : ");

			if (!sc.next().equalsIgnoreCase("y")) {
				break;
			}

		} // while
		ScoreWriter sw = new ScoreWriter();
		sw.writer(ru);
		// 게임 종료 시 기록을 저장

		sc.close();
	}

}
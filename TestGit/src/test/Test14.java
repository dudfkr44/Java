package test;

import java.util.Random;
import java.util.Scanner;

public class Test14 {
	public static void main(String[] args) {
//		중복되지 않은 세자리의 숫자를 난수로 생성
//		입력받은 세자리의 숫자 중 숫자와 자릿수가 같다면 Strike
//		숫자는 같지만 자릿수가 다르다면 Ball
//		모든 숫자가 맞으면 정답을 출력하고 입력을 시도한 숫자를 기입	
		Scanner sc = new Scanner(System.in);

		int[] com = new int[3];
		int[] user = new int[3];

		do {
			for (int i = 0; i < com.length; i++) {
				com[i] = new Random().nextInt(9) + 1;
			}
		} while (com[0] == com[1] || com[1] == com[2] || com[0] == com[2]);
		System.out.println("난수 : " + com[0] + com[1] + com[2]);

		int cnt = 0;
		while (true) {
			cnt++;
			System.out.print(">> ");
			int input = sc.nextInt();

			if (input > 999 || input < 100) {
				System.out.println("세자리의 숫자를 입력하세요.");
				continue;
			}

			user[0] = input / 100;
			user[1] = input / 10 % 10;
			user[2] = input % 10;

			if (user[0] == user[1] || user[1] == user[2] || user[0] == user[2]) {
				System.out.println("서로 다른 숫자를 입력하세요.");
				continue;
			}

			int ball = 0;
			int strike = 0;

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (user[i] == com[j]) {
						if (i == j) {
							strike++;
						} else {
							ball++;
						}
					}
				} // inner
			} // outer
			if (strike == 3) {
				System.out.println(cnt + "회만에 정답!");
				break;
			} else {
				if ((0 < ball) || (0 < strike)) {
					System.out.println(strike + " Strike " + ball + " Ball");
				} else {
					System.out.println("Out!!");
				}
			}
		}
		sc.close();
	} // main
}
